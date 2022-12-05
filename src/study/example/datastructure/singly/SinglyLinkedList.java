package study.example.datastructure.singly;

import study.example.datastructure.list.List;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> implements List<E>, Cloneable {
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
        prevNode.next = newNode;
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
        Node<E> prevNode = head;
        boolean hasValue = false;
        Node<E> x = head;

        //value와 일치하는 노드를 찾는다
        for (; x!=null; x = x.next) {
            if (value.equals(x.data)) {
                hasValue = true;
                break;
            }
            prevNode = x;
        }

        //일치하는 요소가 없을 경우 false 반환
        if (x == null) {
            return false;
        }

        //만약 삭제하려는 노드가 head라면 기존 remove() 사용
        if (x.equals(head)) {
            remove();
            return true;
        } else {
            //이전 노드의 링크를 삭제하려는 노드의 다음 노드로 연결
            prevNode.next = x.next;

            //만약 삭제했던 노드가 마지막 노드라면 tail을 prevNode로 갱신
            if (prevNode.next == null) {
                tail = prevNode;
            }
            x.data = null;
            x.next = null;
            size--;
            return true;
        }
    }

    @Override
    public E remove(int index) {
        if (index == 0) {
            return remove();
        }

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> prevNode = search(index - 1);
        Node<E> removeNode = prevNode.next;
        Node<E> nextNode = removeNode.next;
        E element = removeNode.data;

        prevNode.next = nextNode;

        if (prevNode.next == null) {
            tail = prevNode;
        }

        removeNode.data = null;
        removeNode.next = null;
        size--;

        return element;
    }

    public E remove() {
        Node<E> headNode = head;

        if (headNode == null) {
            throw new NoSuchElementException();
        }

        //삭제된 노드를 반환하기 위한 임시 변수
        E element = headNode.data;
        //head 노드의 다음 노드
        Node<E> nextNode = head.next;

        //head 노드의 데이터들을 모두 삭제
        head.data = null;
        head.next = null;

        //head 가 다음 노드를 가리키도록 업데이트
        head = nextNode;
        size--;

        /**
         * 삭제된 요소가 리스트의 유일한 요소였을 경우 그 요소는 head이자 tail이였으므로
         * 삭제되면서 tail도 가리킬 요소가 없기 때문에 size가 0일 경우 tail도 null로 변환
         */
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
        for (Node<E> x=head; x!=null;) {
            Node<E> nextNode = x.next;
            x.data = null;
            x.next = null;
            x = nextNode;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SinglyLinkedList<? super E> clone = (SinglyLinkedList<? super E>) super.clone();
        clone.head = null;
        clone.tail = null;
        clone.size = 0;

        for (Node<E> x = head; x != null; x = x.next) {
            clone.addLast(x.data);
        }

        return clone;
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
