package study.example.datastructure;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    Object[] elementData;
    private int size;

    public ArrayList() {
        this.elementData = EMPTY_ELEMENTDATA;
        this.size = 0;
    }

    public ArrayList(int capacity) {
        this.elementData = new Object[capacity];
        this.size = 0;
    }

    @Override
    public boolean add(E value) {
        addLast(value);
        return true;
    }

    @Override
    public void add(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == size) {
            addLast(value);
        } else {
            if (size == elementData.length) {
                resize();
            }

            for (int i=size; i>index; i--) {
                elementData[i] = elementData[i - 1];
            }

            elementData[index] = value;
            size++;
        }
    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E value) {

    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    public void addFirst(E value) {
        add(0, value);
    }

    public void addLast(E value) {
        if (size == elementData.length) {
            resize();
        }
        elementData[size] = value;
        size++;
    }

    private void resize() {
        int elementDataCapacity = elementData.length;

        if (Arrays.equals(elementData, EMPTY_ELEMENTDATA)) {
            elementData = new Object[DEFAULT_CAPACITY];
            return;
        }

        if (size == elementDataCapacity) {
            int newCapacity = elementDataCapacity * 2;
            elementData = Arrays.copyOf(elementData, newCapacity);
            return;
        }

        if (size < (elementDataCapacity / 2)) {
            int newCapacity = elementDataCapacity / 2;
            elementData = Arrays.copyOf(elementData, Math.max(newCapacity, DEFAULT_CAPACITY));
            return;
        }
    }
}
