package deque;

public class LinkedListDeque<T> {
    private class LinkedNode {
        public T item;
        public LinkedNode next;
        public LinkedNode pre;
        public LinkedNode(T i, LinkedNode p, LinkedNode n) {
            item = i;
            pre = p;
            next = n;
        }
    }
    private LinkedNode sentinel;
    private int size;
    public LinkedListDeque() {
        sentinel = new LinkedNode(null, null,null);
        sentinel.next = sentinel;
        sentinel.pre = sentinel;
        size = 0;
    }
    public LinkedListDeque(T x) {
        sentinel = new LinkedNode(x, null,null);
        sentinel.next = sentinel;
        sentinel.pre = sentinel;
        size = 1;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void addFirst(T x) {
       //System.out.println(sentinel.item);
        LinkedNode l = new LinkedNode(x, null, null);
        l.next = sentinel.next;
        sentinel.next.pre = l;
        sentinel.next = l;
        l.pre = sentinel;
        size = size + 1;

        //System.out.println(sentinel.next.item);
    }
    public void addLast(T x) {
       // System.out.println(sentinel.next.item);
        LinkedNode l = new LinkedNode(x, null, null);
        l.pre = sentinel.pre;
        sentinel.pre.next = l;
        l.next = sentinel;
        sentinel.pre = l;
        size = size+1;

    }

    public T removeLast() {

        if (size==0) {
            return null;
        }
        T del_node = sentinel.pre.item;


        sentinel.pre.next = sentinel;
        sentinel.pre = sentinel.pre.pre;
       // System.out.println(sentinel.pre.item);
        size = size - 1;


        return del_node;
    }

    public T removeFirst() {

        if (size==0) {
            return null;
        }
        T del_node = sentinel.next.item;

        sentinel.next.next.pre = sentinel;
        sentinel.next = sentinel.next.next;

        size = size - 1;

        return del_node;

    }


    public int size() {
        return size;
    }
    public void printDeque() {
        LinkedNode first = sentinel.next;
        int l = size;
        while (l>0) {
           // System.out.println(l);
            System.out.println(first.item);
            l = l - 1;
            first = first.next;
        }

    }

}
