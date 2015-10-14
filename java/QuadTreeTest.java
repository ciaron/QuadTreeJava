import java.util.ArrayList;

public class QuadTreeTest {
 
    public static void main(String[] args) {
        QuadTree qt = new QuadTree(new BoundingBox(new Point(0,0), 800, 600), 4); // one constructor
        QuadTree qt2 = new QuadTree(0,0, 800, 600, 5); // other constructor
        ArrayList<Point> points = new ArrayList<Point>();
 
        points.add(new Point(1500, 100));

        points.add(new Point(151, 100));
        points.add(new Point(160, 280));
        points.add(new Point(160, 280));
        points.add(new Point(180, 240));
        points.add(new Point(190, 200));

        points.add(new Point(10,100));

        points.add(new Point(450, 550));
        points.add(new Point(450, 500));
        points.add(new Point(750, 10));
        points.add(new Point(50, 200));
        points.add(new Point(150, 400));

        System.out.println("points[0] " + points.get(1));
        for (Point p : points) {
            qt.insert(p);
        }

        System.out.println(points.get(2) == points.get(3)); // not the same!
        System.out.println("points[0] after " + points.get(1));
 
//        System.out.println("QuadTree: " + qt);
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.remove(2) - remove 3rd element: " + qt.remove(2));
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt - print QuadTree: " + qt);


        ArrayList<Point> found = new ArrayList<Point>();
        found = qt.query(new BoundingBox(new Point(120, 150), 130, 300));
        //System.out.println(new BoundingBox(new Point(0, 0), 100, 100).overlaps(new BoundingBox(new Point(50, 50), 300, 300)));
        System.out.println("found points: " + found);

        QuadTree qt3 = qt.findQuadTree(points.get(7));
        if (qt3 != null) {
          System.out.println(points.get(7) + " in QuadTree " + qt3);
        }

    }
}
