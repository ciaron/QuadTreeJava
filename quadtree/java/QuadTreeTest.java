public class QuadTreeTest {
 
    public static void main(String[] args) {
        QuadTree qt = new QuadTree(new AABB(new Point(0,0), 5));
 
        // insert elements to QuadTree
        qt.insert(new Point(1,1));
        qt.insert(new Point(2,3));
        qt.insert(new Point(-4,1));
        qt.insert(new Point(2,1));
        qt.insert(new Point(3,4));
 
        System.out.println("qt - print QuadTree: " + qt);
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.remove(2) - remove 3rd element: " + qt.remove(2));
        //System.out.println("qt.get(3) - get element 3: " + qt.get(3));
        //System.out.println("qt.size() - print QuadTree size: " + qt.size());
        //System.out.println("qt - print QuadTree: " + qt);
    }
}
