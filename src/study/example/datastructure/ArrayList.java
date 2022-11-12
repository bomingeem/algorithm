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
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        E element = (E) elementData[index];
        elementData[index] = null;

        for (int i=index; i<size-1; i++) {
            elementData[i] = elementData[i+1];
            elementData[i+1] = null;
        }

        size--;
        resize();
        return element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elementData[index];
    }

    @Override
    public void set(int index, E value) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            elementData[index] = value;
        }
    }

    @Override
    public boolean contains(Object value) {
        if (indexOf(value) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int indexOf(Object value) {
        int i;
        for (i=0; i<size; i++) {
            if (elementData[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i=0; i<size; i++) {
            elementData[i] = null;
        }
        size = 0;
        resize();
    }

    public int lastIndexOf(Object value) {
        for (int i=size-1; i>=0; i--) {
            if (elementData[i].equals(value)) {
                return i;
            }
        }
        return -1;
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
