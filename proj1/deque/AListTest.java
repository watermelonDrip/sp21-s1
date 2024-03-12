package deque;

import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the AList class.
 *  @author Josh Hug
 */
public class AListTest {
    @Test
    public void testEmptySize() {
        ArrayDeque L = new ArrayDeque();
        assertEquals(0, L.size());
    }

    @Test
    public void testAddAndSize() {
        ArrayDeque L = new ArrayDeque();
        L.addLast(99);
        L.addLast(99);
        assertEquals(2, L.size());
    }
    @Test
    public void testAddAndGetLast() {
        ArrayDeque L = new ArrayDeque();
        L.addLast(99);
        assertEquals(99, L.getLast());
        L.addLast(36);
        assertEquals(36, L.getLast());
    }




    @Test
    public void testGet() {
        ArrayDeque L = new ArrayDeque();
        L.addLast(99);
        assertEquals(99, L.get(0));
        L.addLast(36);
        assertEquals(99, L.get(0));
        assertEquals(36, L.get(1));
    }


    @Test
    public void testRemove() {
        ArrayDeque L = new ArrayDeque();
        L.addLast(99);
        assertEquals(99, L.get(0));
        L.addLast(36);
        assertEquals(99, L.get(0));

    }

    /** Tests insertion of a large number of items.*/
    @Test
    public void testMegaInsert() {
        ArrayDeque L = new ArrayDeque();
        int N = 100;
        for (int i = 0; i < N; i += 1) {
            L.addLast(i);
        }

        for (int i = 0; i < N; i += 1) {
            L.addLast(L.get(i));
        }
    }
}