package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Vector;

public class TestVector {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestVector1(){
        Vector<String> vecty = new Vector<String>();
        vecty.add("books");
        vecty.add("computers");
        vecty.add("basketball");

        vecty.add(1,"gym");

        String expected = "gym";
        String actual = vecty.get(1);

        assertEquals(expected,actual);
    }
}
