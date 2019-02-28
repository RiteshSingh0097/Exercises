// Q5 Implement following functional interfaces from java.util.function using
// lambdas:

package com.bootcamp.java_8_features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q5 {

    public static void main(String[] args) {

        // (1) Consumer
        Consumer<Integer> consumer = e -> System.out.println(e);
        consumer.accept(5);

        // (2) Supplier
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        // (3) Predicate
        Predicate<Integer> predicate = e -> e > 5;
        System.out.println(predicate.test(9));

        // (4) Function
        Function<Integer, Integer> function = e -> e * e;
        System.out.println(function.apply(4));
    }
}
