package study.example.datastructure;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(10);
        singlyLinkedList.add(20);
        singlyLinkedList.add(30);
        singlyLinkedList.add(40);

        singlyLinkedList.add(1, 17);

        singlyLinkedList.remove(2);

        System.out.println(singlyLinkedList.get(3));
        singlyLinkedList.set(1, 188);

        System.out.println("indexOf : " + singlyLinkedList.indexOf(30));
        System.out.println("contains : " + singlyLinkedList.contains(100));
        System.out.println("size : " + singlyLinkedList.size());
    }
}
