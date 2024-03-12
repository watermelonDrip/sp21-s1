public class SLList<Blorp> implements List61B<Blorp> {
    private class Node {
        public Blorp item;
        public Node next;

        public Node(Blorp i, Node n) {
            item = i;
            next = n;
        }
    }
    /* the first item (if it exists) is at sentinel.next*/
    private Node sentinel;
    private int size;
    /** Create an empty SLList*/
    public SLList() {
        sentinel = new Node(null, null);
        size = 0;
    }
    public SLList(Blorp x) {
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
    }
    @Override
    public void insert(Object item, int position) {
        Node p = sentinel;
        while (position > 1 && p.next != null){
            position--;
            p = p.next;
        }
        Node newNode = new Node(item, p.next);
        p.next = newNode;
    }
    public void addFirst(Blorp x) {
        sentinel.next = new Node(x, sentinel.next);
        size = size + 1;
    }

    /**
     * Return the first item in the list
     */
    public Item getFirst() {
        return sentinel.next.item;
    }
    /** Returns the back node of our list. */
    private Node getLastNode() {
        Node p = sentinel;
        /* Move p until it reaches the end*/
        while (p.next != null) {
            p = p.next;
        }
        return p;
    }



    /** Returns the last item */
    public Blorp getLast() {
        Node back = getLastNode();
        return back.item;
    }
    /** Returns the ith item in the list */
    public Blorp get(int i) {
        return get(i, sentinel.next);
    }
    private Blorp get(int i, Node p) {
        if (i == 0) {
            return p.item;
        }
        return get(i-1, p.next);
    }
    /** Returns the size of the list. */
    public int size() {
        return size;
    }
    /** Deletes and returns last item. */
    public Blorp removeLast() {
        Node back = getLastNode();
        if (back == sentinel) {
            return null;
        }
        Node p = sentinel;
        while (p.next != back) {
            p = p.next;
        }
        p.next = null;
        return back.item;
    }
    public void print() {
        System.out.println("This is the OVERRIDDEN version");
        Node p = sentinel.next;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
    }
    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10*/
        SLList L = new SLList();
        L.addLast(20);
        System.out.println(L.size);
    }


}
