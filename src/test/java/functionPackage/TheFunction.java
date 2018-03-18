package functionPackage;

import createAPI.Person;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Takes an object and returns another object
 */
public class TheFunction {

    public static void main(String[] args) {

        Person p = new Person("Ish", "Mishra", 26);

        Function<Person, Integer> ageMapper = (p1) -> p1.getAge();

        //Use it here
        System.out.println(ageMapper.apply(p));

        //Use BiFunction
        BiFunction<Person, String, String> ageMapperDisplay = (p1, s1) -> {
            return (s1 + p1.getAge());
        };

        //use
        System.out.println(ageMapperDisplay.apply(p, "His age is "));
    }
    //You also have UnaryFunction an BinaryFunction which actually extend Function and BiFunction
}
