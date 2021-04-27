package study.codingInterview;

import java.util.NoSuchElementException;

public class MyQueue {
    //FIFO(First-In-First-Out)
    private static class QueueNode<T> {
        private T data;
        private QueueNode next;

        public QueueNode(T data) {
            this.data = data;
        }

        private QueueNode first;
        private QueueNode last;

        //add(item): item 을 리스트의 끝부분에 추가한다
        public void add(T item) {
            QueueNode t = new QueueNode(item);
            if (last != null) {
                last.next = t;
            }
            last = t;
            if (first == null) {
                first = last;
            }
        }

        //remove(): 리스트의 첫번째 항목을 제거한다
        public T remove() {
            if (first == null) throw new NoSuchElementException();
            T data = (T) first.data;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return data;
        }

        //peek(): 큐에서 가장 위에 있는 항목을 반환한다
        public T peek() {
            if (first == null) throw new NoSuchElementException();
            return (T) first.data;
        }

        //isEmpty(): 큐가 비어있을 때 true 를 반환한다
        public boolean isEmpty() {
            return first == null;
        }
    }
}
