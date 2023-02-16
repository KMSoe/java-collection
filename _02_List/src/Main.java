import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        System.out.println(animals.get(1));

        animals.add(1, "Elephant");
        System.out.println(animals.get(1));

        for (String animal : animals) {
            System.out.println(animal);
        }

        Collections.sort(animals);

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}