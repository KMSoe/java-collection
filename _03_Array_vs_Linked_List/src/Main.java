import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Array List");
        testList(arrayList);

        System.out.println("Linked List");
        testList(linkedList);
    }

    public static void testList(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time Taken: " + (end - start) + "ms");
    }
}