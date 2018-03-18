package functionPackage;

import createAPI.Person;

import java.util.function.Supplier;

/**
 * The supplier provides an object and takes no parameter
 */
public class TheSupplier {

    public static void main(String[] args) {

        Supplier<Person> sup1 = () -> new Person("Ish", "Mishra", 26);

        //User supplier
        System.out.println(sup1.get());
    }
}
