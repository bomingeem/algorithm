package study.example.datastructure.list;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        arrayList.add(3, 35);

        for (Object result : arrayList.toArray()) {
            System.out.print(result + " ");
        }
        System.out.println();

        arrayList.set(2, 32);

        for (Object result : arrayList.toArray()) {
            System.out.print(result + " ");
        }
        System.out.println();

        arrayList.remove(2);

        for (Object result : arrayList.toArray()) {
            System.out.print(result + " ");
        }
        System.out.println();

        System.out.println(arrayList.get(4));

        System.out.println("indexOf : " + arrayList.indexOf(35));
        System.out.println("contains : " + arrayList.contains(80));
        System.out.println("size : " + arrayList.size());
    }
}
