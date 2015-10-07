public class QuadTreeTest {
 
    public static void main(String[] args) {
        QuadTree qt = new QuadTree(new BoundingBox(new Point(0,0), 800, 600), 4);
 
        // insert elements to QuadTree, these go at the top level
        qt.insert(new Point(100,100));  //
        qt.insert(new Point(200,300));  //
        qt.insert(new Point(400,100));
        qt.insert(new Point(200,100));

        // this one causes a tree split
        qt.insert(new Point(500,400)); // SE

        // this one should go into SW
        qt.insert(new Point(301,240)); //
        qt.insert(new Point(10, 360)); //
        qt.insert(new Point(10, 360)); //
        qt.insert(new Point(20, 360)); //
        qt.insert(new Point(30, 360)); //
 
        System.out.println("QuadTree: " + qt);
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.remove(2) - remove 3rd element: " + qt.remove(2));
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt - print QuadTree: " + qt);
    }
}
