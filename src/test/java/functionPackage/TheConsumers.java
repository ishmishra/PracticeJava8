package functionPackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * The Consumer/BiConsumer consumes an object and doesn't return anything
 */
public class TheConsumers {

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        BiConsumer<String, Integer> biConsumer = (s1, i1) -> {
            System.out.println(s1 + " " + i1);
        };

        //Use the above here
        consumer.accept("I am using Consumer here");
        biConsumer.accept("Using BiConsumer to display the integer", 25);
    }
}
