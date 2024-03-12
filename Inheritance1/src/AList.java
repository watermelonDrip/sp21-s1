public class AList {
    private Item[] items;
    private int size;

    /**Create an empty list*/
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }
    /** Insert item into given position*/
    public void insert(Item x, int position) {
        Item[] newItems = (Item[]) new Object[items.length + 1];

        System.arraycopy(items, 0, newItems, 0, position);

        
    }

}
