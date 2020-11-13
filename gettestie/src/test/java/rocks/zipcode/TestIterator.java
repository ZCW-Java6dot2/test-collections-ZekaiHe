package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Iterator;
import java.util.ArrayList;

public class TestIterator {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestIterator() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(20);
        boolean contain = false;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == 5) {
                contain = true;
            }
        }
        assertTrue(contain);
    }
}
