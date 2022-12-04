package study.example.datastructure.doubly;

import study.example.datastructure.List;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
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

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node<E> prevNode = search(index - 1);
        Node<E> nextNode = prevNode.next;
        Node<E> newNode = new Node<>(value);

        prevNode.next = null;
        nextNode.prev = null;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = nextNode;
        nextNode.prev = newNode;
        size++;
    }

    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
        size++;

        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(E value) {
        Node<E> newNode = new Node<>(value);

        if (size == 0) {
            addFirst(value);
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode = tail;
        size++;

    }

    @Override
    public boolean remove(Object value) {
        Node<E> prevNode = this.head;
        Node<E> x = this.head;

        for (; x != null; x = x.next) {
            if (value.equals(x.data)) {
                break;
            }
            prevNode = x;
        }

        if (x == null) {
            return false;
        }

        if (x.equals(head)) {
            remove();
            return true;
        } else {
            Node<E> nextNode = x.next;
            prevNode.next = null;
            x.prev = null;
            x.data = null;
            x.next = null;

            if (nextNode != null) {
                nextNode.prev = null;
                nextNode.prev = prevNode;
                prevNode.next = nextNode;
            } else {
                tail = prevNode;
            }

            size--;
            return true;
        }
    }

    @Override
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            E element = head.data;
            remove();
            return element;
        }

        Node<E> prevNode = search(index - 1);
        Node<E> removeNode = prevNode.next;
        Node<E> nextNode = removeNode.next;

        E element = removeNode.data;

        prevNode.next = null;
        removeNode.prev = null;
        removeNode.data = null;
        removeNode.next = null;

        if (nextNode != null) {
            nextNode.prev = null;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        } else {
            tail = prevNode;
        }

        size--;

        return element;
    }

    public E remove() {
        Node<E> headNode = this.head;

        if (headNode == null) {
            throw new NoSuchElementException();
        }

        E element = headNode.data;

        Node<E> nextNode = headNode.next;

        head.data = null;
        head.next = null;

        if (nextNode != null) {
            nextNode.prev = null;
        }

        head = nextNode;
        size--;

        if (size == 0) {
            tail = null;
        }

        return element;
    }

    @Override
    public E get(int index) {
        return search(index).data;
    }

    @Override
    public void set(int index, E value) {
        Node<E> replaceNode = search(index);
        replaceNode.data = null;
        replaceNode.data = value;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(Object value) {
        int index = 0;

        for (Node<E> x = head; x != null; x = x.next) {
            if (value.equals(x.data)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int lastIndexOf(Object value) {
        int index = size;

        for (Node<E> x = tail; x != null; x = x.prev) {
            index--;
            if (value.equals(x.data)) {
                return index;
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
        for (Node<E> x = head; x != null;) {
            Node<E> nextNode = x.next;
            x.data = null;
            x.next = null;
            x.prev = null;
            x = nextNode;
        }
        head = tail = null;
        size = 0;
    }

    private Node<E> search(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index > size/2) {
            Node<E> x = this.tail;
            for (int i=size-1; i>index; i--) {
                x = x.prev;
            }
            return x;
        } else {
            Node<E> x = this.head;
            for (int i=0; i<index; i++) {
                x = x.next;
            }
            return x;
        }
    }
}
