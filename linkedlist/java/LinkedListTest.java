public class LinkedListTest {
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
 
        // add elements to LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
 
        /*
         * Please note that primitive values can not be added into LinkedList
         * directly. They must be converted to their corresponding wrapper
         * class.
         */
 
        System.out.println("list - print linkedlist: " + list);
        System.out.println("list.size() - print linkedlist size: " + list.size());
        System.out.println("list.get(3) - get element 3: " + list.get(3));
        System.out.println("list.remove(2) - remove 3rd element: " + list.remove(2));
        System.out.println("list.get(3) - get element 3: " + list.get(3));
        System.out.println("list.size() - print linkedlist size: " + list.size());
        System.out.println("list - print linkedlist: " + list);
    }
}
