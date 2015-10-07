public class QuadTreeTest {
 
    public static void main(String[] args) {
        QuadTree qt = new QuadTree(new BoundingBox(new Point(0,0), 800, 600), 4);
 
        // insert elements to QuadTree, these go at the top level
        System.out.println(qt.insert(new Point(100,100)));
        System.out.println(qt.insert(new Point(200,300)));
        System.out.println(qt.insert(new Point(400,100)));
        System.out.println(qt.insert(new Point(200,100)));
        System.out.println(qt.insert(new Point(300,400)));

        // this one causes a tree split
        System.out.println(qt.insert(new Point(-300,200)));
 
        System.out.println("qt - print QuadTree: " + qt);
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.remove(2) - remove 3rd element: " + qt.remove(2));
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt - print QuadTree: " + qt);
    }
}
