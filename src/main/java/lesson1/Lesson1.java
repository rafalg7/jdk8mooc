/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 * <p>
 * JDK 8 MOOC Lesson 1 homework
 */
package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lesson1 {

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */
    /**
     * Exercise 1
     * <p>
     * Create a string that consists of the first letter of each word in the list
     * of Strings provided.
     */
    public String exercise1(List<String> list) {
        return list.stream().map(s -> s.substring(0, 1)).collect(Collectors.joining());
    }

    /**
     * Exercise 2
     * <p>
     * Remove the words that have odd lengths from the list.
     */
    public List<String> exercise2(List<String> list) {
        list.removeIf((s) -> s.length() % 2 == 0);
        return list;
    }

    /**
     * Exercise 3
     * <p>
     * Replace every word in the list with its upper case equivalent.
     */
    public List<String> exercise3(List<String> list) {
        list.replaceAll(String::toUpperCase);
        return list;
    }

    /**
     * Exercise 4
     * <p>
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    public String exercise4(Map<String, Integer> map) {
        return map.entrySet().stream().map((s) -> s.getKey().concat(s.getValue().toString())).collect(Collectors.joining());
    }

    /**
     * Exercise 5
     * <p>
     * Create a new thread that prints the numbers from the list.
     */
    public List<Integer> exercise5(final List<Integer> list) throws InterruptedException {

        final List<Integer> printedNumbers = new ArrayList<>();

        final Thread thread = new Thread(() -> {
            list.forEach(printedNumbers::add);
        });
        thread.start();
        thread.join();
        return printedNumbers;
    }
}
