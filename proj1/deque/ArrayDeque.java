package deque;

import java.lang.reflect.Array;

public class ArrayDeque<T> {
    T[] items;
    int size;
    int nextFirst;
    int nextLast;

    /** Create an empty array deque*/
    public ArrayDeque() {
        items = (T []) new Object[8];
        size = 0;
        nextFirst = 0;
        nextLast = 0;
    }

    public void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }
    public void addLast(T item) {
        if (size == items.length) {
            resize(size + 1);
        }
        items[nextLast] = item;
        size = size + 1;
        nextLast = nextLast + 1;

    }

    public void addFirst(T item) {
        if (size == items.length) {
            resize(size + 1);
        }

        items[(nextFirst+8-1)%8] = item;
        size= size+1;
        nextFirst = nextFirst - 1;
    }

    public void removeFirst(T item) {
        size = size + 1;
    }
    public void removeLast(T item) {
        size = size + 1;
    }
    public T getLast() {
        return items[size-1];
    }
    public T get(int index) {
        return items[index];
    }
    public int size() {
        return size;
    }



}
