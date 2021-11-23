package lesson_2;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<E extends Comparable<E>> {

    private E[] list;
    private int size;

    private final int CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (E[]) new Comparable[capacity];
    }

    public MyArrayList() {
        list = (E[]) new Comparable[CAPACITY];
    }

    public void add(E item) {
        if (size == CAPACITY)
            size = size / 2 + 1;
        list[size] = item;
        size++;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size)
            throw new NoSuchElementException();
        if (size == CAPACITY)
            size = size / 2 + 1;
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public void remove(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (index < 0 || index >= size)
            throw new NoSuchElementException();
        for (int i = index; i <= size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        list[size] = null;
    }

    public boolean remove(E item) {
        int i = index(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new NoSuchElementException();
        return list[index];
    }

    public int indexOf(E item) {
        return index(item);
    }

    private int index(E item) {
        int i;
        for (i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}