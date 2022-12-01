package study.example.datastructure.doubly;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add(1);
        doublyLinkedList.add(3);
        doublyLinkedList.add(5);
        doublyLinkedList.add(1, 2);
    }
}
