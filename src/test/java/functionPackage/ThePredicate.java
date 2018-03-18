package functionPackage;

import createAPI.Person;

import java.util.function.Predicate;

//The predicate takes an object and returns a boolean
public class ThePredicate {

    public static void main(String[] args) {
        Boolean myValue = false;

        Predicate<Person> pred = (p1) -> {
            return true;
        };
    }
}
