package study.example.datastructure;

public class SinglyLinkedList<E> implements List<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
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

        //추가하려는 위치의 이전 노드
        Node<E> prevNode = search(index - 1);
        //추가하려는 위치의 노드
        Node<E> nextNode = prevNode.next;
        //추가하려는 노드
        Node<E> newNode = new Node<>(value);

        /**
         * 이전 노드가 가리키는 노드를 끊은 뒤 새 노드로 변경해준다
         * 또한 새 노드가 가리키는 노드는 nextNode로 설정해준다
         */
        prevNode.next = null;
        prevNode.next = nextNode;
        newNode.next = nextNode;
        size++;
    }

    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.next = head;
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
        tail = newNode;
        size++;
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

    private Node<E> search(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> node = head;

        for (int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }
}
