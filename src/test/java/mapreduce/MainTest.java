package mapreduce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void testSumInts() {
        assertEquals(Main.sumInts(5, 10), 45);
    }

    @Test
    public void testSumCube() {
        assertEquals(Main.sumCube(5, 10), 45);
    }

    @Test
    public void testFact() {
        assertEquals(Main.fact(5), 120);
    }
}