/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 * <p>
 * JDK 8 MOOC Lesson 2 homework
 */
package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson2 {
    private static final String WORD_REGEXP = "[- .:,]+";

    /**
     * Exercise 1
     * <p>
     * Create a new list with all the strings from original list converted to
     * lower case and print them out.
     */
    public List<String> exercise1(List<String> list) {
        return list.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    /**
     * Exercise 2
     * <p>
     * Modify exercise 1 so that the new list only contains strings that have an
     * odd length
     */
    public List<String> exercise2(List<String> list) {
        return list.stream().filter((s) -> s.length() % 2 != 0).collect(Collectors.toList());
    }

    /**
     * Exercise 3
     * <p>
     * Join the second, third and forth strings of the list into a single string,
     * where each word is separated by a hyphen (-). Print the resulting string.
     */
    public String exercise3(List<String> list) {
        return list.stream().skip(1).limit(3).collect(Collectors.joining("-"));
    }

    /**
     * Count the number of lines in the file using the BufferedReader provided
     */
    public long exercise4(final String path) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(path), StandardCharsets.UTF_8)) {
            return reader.lines().count();
        }
    }

    /**
     * Using the BufferedReader to access the file, create a list of words with
     * no duplicates contained in the file.  Print the words.
     * <p>
     * HINT: A regular expression, WORD_REGEXP, is already defined for your use.
     */
    public List<String> exercise5(final String path) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(path), StandardCharsets.UTF_8)) {
            return reader.lines().flatMap((s) -> Stream.of(s.split(WORD_REGEXP))).distinct().collect(Collectors.toList());

        }
    }

    /**
     * Using the BufferedReader to access the file create a list of words from
     * the file, converted to lower-case and with duplicates removed, which is
     * sorted by natural order.  Print the contents of the list.
     */
    public List<String> exercise6(final String path) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(path), StandardCharsets.UTF_8)) {
            return reader.lines().flatMap(line -> Stream.of(line.split(WORD_REGEXP))).map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
        }
    }

    /**
     * Modify exercise6 so that the words are sorted by length
     */
    public List<String> exercise7(final String path) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(path), StandardCharsets.UTF_8)) {
            return reader.lines().flatMap(line -> Stream.of(line.split(WORD_REGEXP))).map(String::toLowerCase).distinct().sorted((o1, o2) -> o1.length() - o2.length()).collect(Collectors.toList());
        }
    }
}

