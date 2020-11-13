package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.TreeMap;

public class TestTreeMap {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeMap1(){

        TreeMap<Integer, String> treeStuff = new TreeMap<Integer, String>();
        treeStuff.put(4, "blue");
        treeStuff.put(2, "red");
        treeStuff.put(3, "green");
        treeStuff.put(5, "yellow");

        String actual = treeStuff.get(treeStuff.higherKey(2));
        String expected = "green";

        assertEquals(expected,actual);
    }
}
