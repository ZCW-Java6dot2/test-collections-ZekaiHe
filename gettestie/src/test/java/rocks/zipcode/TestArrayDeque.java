package rocks.zipcode;

import org.junit.Assert;

import static org.junit.Assert.*;
import java.util.ArrayDeque;

public class TestArrayDeque {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayDeque1(){
        ArrayDeque<Integer> arrDq = new ArrayDeque<Integer>();
        arrDq.add(1);
        arrDq.add(2);
        arrDq.add(3);
        arrDq.add(2);

        arrDq.removeLast();
        Integer i = arrDq.getLast();
        Integer expected = 3;
        assertEquals(i, expected);

    }
}
