public class Main {
    public static void main(String[] args) {
        /*Creates a list  */
        SLList L = new SLList(15);
        L.addFirst(10);
        System.out.println(L.getFirst());
        L.addLast(5);
        System.out.println(L.getFirst());
        L.addFirst(1);
        System.out.println(L.getFirst());

    }
}