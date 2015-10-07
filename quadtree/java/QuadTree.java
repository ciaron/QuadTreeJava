import java.util.*;

class QuadTree {

    final int CAPACITY;

    QuadTree NW;
    QuadTree NE;
    QuadTree SW;
    QuadTree SE;

    // list of points in this quadtree;
    ArrayList<Point> points = new ArrayList<Point>();

    BoundingBox bounds;

    //private Node head;
    //private int length;

    public QuadTree(BoundingBox _bounds, int capacity) {
        NW = null;
        SW = null;
        NE = null;
        SE = null;
        CAPACITY = capacity;
        bounds = _bounds;
    }

    public boolean insert(Point p) {
        // insert a point into the QuadTree
        if (!bounds.containsPoint(p))
            return false;

        if (points.size() < CAPACITY &&  NW == null) {
          points.add(p);
          return true;
        } else {
          // split the node
          split(this);
          return false;
        }
    }

    public void split(QuadTree qt) {
        System.out.println("splitting: " + this.bounds);
        NW = new QuadTree(new BoundingBox(new Point(0,0), 400, 300), 4);
        SW = new QuadTree(new BoundingBox(new Point(0,0), 400, 300), 4);
        NE = new QuadTree(new BoundingBox(new Point(0,0), 400, 300), 4);
        SE = new QuadTree(new BoundingBox(new Point(0,0), 400, 300), 4);
        
    }

    public int remove(int idx) {
        // remove item at given index
        int success=0;
        return success;
    }

    public String toString() {
        String output = "";
        for (Point p : points) {
            //System.out.println(p);
            output += p + ", ";
        }
        return output;
    }
}
