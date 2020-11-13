package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPriorityQueue1(){
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        pQ.add(3);
        pQ.add(1);

        Integer expected = 1;
        Integer x = pQ.poll();
        assertEquals(x,expected );
    }
}
