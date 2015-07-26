package lesson2;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rafal on 7/26/15.
 */
public class Lesson2Test {

    public static final String PATH = "src/main/resources/lesson2/SonnetI.txt";
    private Lesson2 instance = new Lesson2();


    @Test
    public void exercise1Test() {

        //given
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
        List<String> expected = Arrays.asList(
                "the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        //when
        final List<String> result = instance.exercise1(list);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise2Test() {
        //given
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
        List<String> expected = Arrays.asList("The", "Quick", "BROWN", "Fox", "The", "DOG");

        //when
        final List<String> result = instance.exercise2(list);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise3Test() {
        //given
        final List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");
        final String expected = "quick-brown-fox";

        //when
        final String result = instance.exercise3(list);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise4Test() throws IOException {
        //given
        final long expected = 14;

        //when
        final long result = instance.exercise4(PATH);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void exercise5Test() throws IOException {
        //given
        final int expected = 87;

        //when
        final List<String> result = instance.exercise5(PATH);
        final int size = result.size();

        //then
        Assert.assertEquals(expected, size);
    }

    @Test
    public void exercise6Test() throws IOException {
        //given
        final int expected = 81;
        final String expectedFirst = "a";
        final String expectedLast = "world's";

        //when
        final List<String> result = instance.exercise6(PATH);
        final int size = result.size();

        //then
        Assert.assertEquals(expected, size);
        Assert.assertEquals(expectedFirst, result.get(0));
        Assert.assertEquals(expectedLast, result.get(result.size() - 1));
    }

    @Test
    public void exercise7Test() throws IOException {
        //given
        final int expected = 81;
        final String expectedFirst = "a";
        final String expectedLast = "substantial";

        //when
        final List<String> result = instance.exercise7(PATH);
        final int size = result.size();

        //then
        Assert.assertEquals(expected, size);
        Assert.assertEquals(expectedFirst, result.get(0));
        Assert.assertEquals(expectedLast, result.get(result.size() - 1));
    }

}
