import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

//        Collection<Person> persons = getData();
//
//        for (Person p : persons) {
//            System.out.println("Name: " + p.getName() + "\n" + "Age: " + p.getAge());
//        }
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);

        Iterator i = numbers.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static Collection<Person> getData() {
        Person p1 = new Person("Mg Mg", 23);
        Person p2 = new Person("Aung Aung", 22);
        Person p3 = new Person("Ma Ma", 26);

        Collection<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        return  persons;
    }
}