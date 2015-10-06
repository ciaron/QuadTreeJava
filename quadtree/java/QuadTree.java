import java.util.*;

class QuadTree {

    final int CAPACITY = 5;

    QuadTree NW;
    QuadTree NE;
    QuadTree SW;
    QuadTree SE;

    // list of points in this quadtree;
    ArrayList<Point> points = new ArrayList<Point>();

    AABB bounds;

    //private Node head;
    //private int length;

    public QuadTree(AABB _bounds) {
        NW = null;
        SW = null;
        NE = null;
        SE = null;
    }

    public void insert(Point p) {
        // insert a point into the QuadTree
        points.add(p);
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
