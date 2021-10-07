package mapreduce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void testSumInts() {
        int expected = 45;
        int actual = Main.sumInts().apply(5, 10);
        assertEquals(actual, expected);
    }

    @Test
    public void testSumCube() {
        int expected = 2925;
        int actual = Main.sumCube().apply(5, 10);
        assertEquals(actual, expected);
    }

    @Test
    public void testFact() {
        assertEquals(Main.fact(5), 120);
    }

    @Test
    public void testProductFunction() {
        int expected = 14400;
        int actual = Main.product(x -> x * x).apply(1, 5);
        assertEquals(actual, expected);
    }

    @Test
    public void testSumPerf() {
        int expected = 705082694;
        int actual = Main.sumInts().apply(5, 100000);
        assertEquals(actual, expected);
    }
}