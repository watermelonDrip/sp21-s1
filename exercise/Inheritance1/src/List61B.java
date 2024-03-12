public interface List61B<Item> {

    /** Inserts item into given position.
     * Code from discussion #3 */

    public void insert(Item x, int position);



    /** Inserts an item at the front. */

    public void addFirst(Item x);

    public void addLast(Item x);
;
    public Item getFirst();

    /** Returns the item from the back of the list. */
    public Item getLast();
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i);

    /** Returns the number of items in the list. */
    public int size();
    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast();

}