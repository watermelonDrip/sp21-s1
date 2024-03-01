

/** An SLList is a list of integers, which hides the terrible truth of the nakedness within*/
public class SLList {
    public IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public static void main(String[] args){
        /*  Create a list of one integer, namely 10*/
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
    }
    /* Adds x to the front of the list*/
    public void addFirst(int x) {
         first = new IntNode(x, first);
    }
    public int getFirst() {
        return first.item;
    }


}
