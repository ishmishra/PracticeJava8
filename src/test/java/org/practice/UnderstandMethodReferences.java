package org.practice;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class UnderstandMethodReferences {

    /**
     * Method References - An alternative syntax for Lambda Expressions
     */
    public void useOne() {

        //Using Lambda
        Function<Object, Integer> f = obj -> obj.hashCode();

        //Using method reference
        Function<Object, Integer> fR = Object::hashCode;

        //Using Lambda
        BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;

        //Using method reference
        BinaryOperator<Integer> sumR = Integer::sum;

        //Using Lambda
        Consumer<String> printer = (s1) -> System.out.println(s1);

        //Using method reference
        Consumer<String> prin = System.out::println;
    }
}
