package lesson1;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by rafal on 7/26/15.
 */
public class Lesson1Test {

    private Lesson1 instance = new Lesson1();


    @Test
    public void exercise1Test() {

        //given
        final List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        final String expected = "abcdef";

        //when
        final String result = instance.exercise1(list);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise2Test() {

        //given
        final List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        final List<String> expected = Arrays.asList("alpha", "bravo", "charlie", "delta", "foxtrot");

        //when
        final List<String> result = instance.exercise2(list);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise3Test() {

        //given
        final List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        final List<String> expected = Arrays.asList("ALPHA", "BRAVO", "CHARLIE", "DELTA", "ECHO", "FOXTROT");

        //when
        final List<String> result = instance.exercise3(list);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise4Test() {

        //given
        final Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);
        final String expected = "a1b2c3";

        //when
        final String result = instance.exercise4(map);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise5Test() throws InterruptedException {

        //given
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //when
        final List<Integer> result = instance.exercise5(list);

        //then
        Assert.assertEquals(expected, result);
    }

}
