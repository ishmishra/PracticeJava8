package createAPI;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class TestMain {

    public static void main(String[] args) {

        //Implement a comparators for Person

        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpPerson = (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName());

        //Another way of achieving
        Function<Person, Integer> f1 = Person::getAge;
        Function<Person, String> f2 = Person::getFirstName;

        Comparator<Person> cmpPersAge = Comparator.comparing(Person::getAge)
                .thenComparing(Person::getFirstName);

        //Test
        Person p1 = new Person("Name", "LasNam", 27);
        Person p2 = new Person("Mame", "LasNam", 27);

        System.out.println(cmpPersAge.compare(p1, p2));
    }
}
