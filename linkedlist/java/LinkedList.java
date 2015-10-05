class LinkedList {

    private Node head;
    private int length;

    public LinkedList() {
        head = new Node(-999); // sentinel node
        length = 0;
    }

    public void add(int d) {
        // append data to end of list
        Node tmp = new Node(d);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(tmp);
        length += 1;
    }

    public int remove(int idx) {
        // remove item at given index
        int success=0;
        Node current = head;
        for (int i=0; i<idx; i++) {
            current=current.getNext();
        }
        current.setNext(current.getNext().getNext());
        length -= 1;
        return success;
    }

    public int get(int idx) {
        int d;
        // return the item at index i in the list
        Node current = head.getNext();
        for (int i=0; i<idx; i++) {
            current=current.getNext();
        }
        return current.getData();
    }

    public int size() {
        return length;
    }

    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            //output += "[" + current.getData().toString() + "]";
            output += "[" + current.getData() + "]";
            current = current.getNext();
        }
        return output;
    }

    private class Node {
        Node next;
        int data;

        // Node constructor   
        public Node(int d) {
            next = null;
            data = d;
        }

        public int getData() {
            return data;
        }

        public void setData(int d) {
            data = d;
        }

        public Node getNext() {
            return next;
        }
 
        public void setNext(Node n) {
            next = n;
        }
    }
}
