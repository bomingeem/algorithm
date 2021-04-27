package study.codingInterview;

import java.util.EmptyStackException;

public class MyStack {
    //LIFO(Last-In-First-Out)
    private static class StackNode<T> {
        private T data;
        private StackNode next;

        public StackNode(T data) {
            this.data = data;
        }

        private StackNode top;
        //pop(): 스택에서 가장 위에 있는 항목을 제거한다
        public T pop() {
            if (top == null) throw new EmptyStackException();
            T item = (T) top.data;
            top = top.next;
            return item;
        }

        //push(item): item 하나를 스택의 가장 윗 부분에 추가한다
        public void push(T item) {
            StackNode t = new StackNode(item);
            t.next = top;
            top = t;
        }

        //peek(): 스택의 가장 위에 있는 항목을 반환한다
        public T peek() {
            if (top == null) throw new EmptyStackException();
            return (T) top.data;
        }

        //isEmpty(): 스택이 비어 있을 때 true 를 반환한다
        public boolean isEmpty() {
            return top == null;
        }
    }
}
