package mapreduce;

import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void testSumInts() {
        assertEquals(Main.sumInts(5, 10), 45);
    }

    @Test
    public void testSumCube() {
        assertEquals(Main.sumCube(5, 10), 2925);
    }

    @Test
    public void testFact() {
        assertEquals(Main.fact(5), 120);
    }

    @Test
    public void testProductFunction() {
        assertEquals(Main.product(x -> x * x, 1, 5), 14400);
    }

    @Test
    public void testSumPerf() {
        assertEquals(Main.sumInts(5, 100000), 705082694);
    }

    @Test
    public void testJavaPartialApplication() {
        BiFunction<Integer, Integer, Integer> op = (a, b) -> Main.product(x -> x + x, a, b);
        assertEquals(Main.mapReduce(1, op, x->x, 1, 5), 1);
    }

}