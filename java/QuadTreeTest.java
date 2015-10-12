import java.util.ArrayList;

public class QuadTreeTest {
 
    public static void main(String[] args) {
        QuadTree qt = new QuadTree(new BoundingBox(new Point(0,0), 800, 600), 4);
 
        qt.insert(new Point(150, 100));
        qt.insert(new Point(160, 280));
        qt.insert(new Point(170, 260));
        qt.insert(new Point(180, 240));
        qt.insert(new Point(190, 200));

        qt.insert(new Point(10,100));

        qt.insert(new Point(450, 550));
        qt.insert(new Point(450, 500));
        qt.insert(new Point(750, 10));
        qt.insert(new Point(50, 200));
        qt.insert(new Point(150, 400));
 
        System.out.println("QuadTree: " + qt);
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.remove(2) - remove 3rd element: " + qt.remove(2));
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt - print QuadTree: " + qt);


        ArrayList<Point> points = new ArrayList<Point>();
        points = qt.query(new BoundingBox(new Point(120, 150), 130, 300));
        //System.out.println(new BoundingBox(new Point(0, 0), 100, 100).overlaps(new BoundingBox(new Point(50, 50), 300, 300)));
        System.out.println("points: " + points);

    }
}
