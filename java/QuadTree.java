import java.util.*;

class QuadTree {

    final int CAPACITY;

    QuadTree NW;
    QuadTree NE;
    QuadTree SW;
    QuadTree SE;

    // list of points in this quadtree; Initially empty
    ArrayList<Point> points = new ArrayList<Point>();

    BoundingBox bounds;

    public QuadTree(int x, int y, int width, int height, int capacity) {
        NW = null;
        SW = null;
        NE = null;
        SE = null;
        CAPACITY = capacity;
        bounds = new BoundingBox(new Point(x, y), width, height);
    }
    public QuadTree(BoundingBox _bounds, int capacity) {
        NW = null;
        SW = null;
        NE = null;
        SE = null;
        CAPACITY = capacity;
        bounds = _bounds;

        // TODO: add parent QuadTree here? Useful for removals?
    }

    public boolean insert(Point p) {

        // special test case:
        if (p.x == 151) p.x = 152;
        // the object here /is/ the object added, not a copy!

        // inserts a point into the QuadTree

        if (!bounds.containsPoint(p)) {
            //System.out.println("cannot add point, it's not in the bounds of QuadTree" + this + p);
            return false; // cannot add point, it's not in the bounds of this QuadTree
        }

        if (points.size() < CAPACITY && NW == null) {
            // we haven't filled the quad yet, add it here
            points.add(p);
            return true;
        } 

        if (NW == null) { // and points is full...
   
            // split the quad, it's full. If it has sub-quads, the size is zero, since we rebalance in split()
            // i.e. Quads with children have no points of their own.
            split(this);
        }

        if (NW.insert(p)) return true;
        if (NE.insert(p)) return true;
        if (SW.insert(p)) return true;
        if (SE.insert(p)) return true;

        return false;
    }

    public void split(QuadTree qt) {
//        System.out.println("splitting: " + this.bounds);

        int bx = bounds.origin.x;
        int by = bounds.origin.y;
        int bw = bounds.width;
        int bh = bounds.height;

        // create the 4 new QuadTrees 
        NW = new QuadTree(new BoundingBox(new Point(bx, by), bw/2, bh/2), 4);
        SW = new QuadTree(new BoundingBox(new Point(bx, by + bh/2), bw/2, bh/2), 4);
        NE = new QuadTree(new BoundingBox(new Point(bx + bw/2, by), bw/2, bh/2), 4);
        SE = new QuadTree(new BoundingBox(new Point(bx + bw/2, by + bh/2), bw/2, bh/2), 4);

        // redistribute this quads points to the new child quads
        int count = 0;
        for (Point p : points) {
            if (NW.bounds.containsPoint(p)) {
                NW.points.add(p);
                count+=1;
            }
            if (NE.bounds.containsPoint(p)) {
                NE.points.add(p);
                count+=1;
            }
            if (SW.bounds.containsPoint(p)) {
                SW.points.add(p);
                count+=1;
            }
            if (SE.bounds.containsPoint(p)) {
                SE.points.add(p);
                count+=1;
            }
                
        }

        points.clear(); // the points are all now in the child quads
        System.out.println("I moved " + count + " points");

    }
    
    public QuadTree findQuadTree(Point _p) {
        // find the QuadTree that holds this point
        for (Point p : points) {
            if (p == _p) return this;
        }

        if (NW != null) {
            if (null != NW.findQuadTree(_p)) return NW;
            if (null != SE.findQuadTree(_p)) return SE;
            if (null != SW.findQuadTree(_p)) return SW;
            if (null != NE.findQuadTree(_p)) return NE;
        }

        return null;
    }

    public ArrayList<Point> query(BoundingBox box) {
        // return a list of all the points which are inside the bounding box
        // recurse into sub-quads

        ArrayList<Point> pointsInRange = new ArrayList<Point>();

        if (!box.overlaps(bounds)) {
            return pointsInRange;
        }

        for (Point p : points) {
            if (box.containsPoint(p)) {
                pointsInRange.add(p);
                System.out.println(p + " is in box " + box);
            }
        }

        if (NW == null) {
            return pointsInRange;
        }

        pointsInRange.addAll(NW.query(box));
        pointsInRange.addAll(NE.query(box));
        pointsInRange.addAll(SW.query(box));
        pointsInRange.addAll(SE.query(box));

        return pointsInRange;
        
    }

    public int remove(int idx) {
        // remove item at given index
        int success=0;
        return success;
    }

    public String toString() {
        String output = "";
        //output += bounds.origin + " : " + bounds.width + "x" + bounds.height + ", points: ";
        output += bounds.origin + " : " + bounds.width + "x" + bounds.height;
        //for (Point p : points) {
        //    output += p + ", ";
        //}
        output += "\n";
        if (NW != null) {
            output += NW +"\n";
            output += NE +"\n";
            output += SW +"\n";
            output += SE +"\n";
        }
        return output;
    }
}
