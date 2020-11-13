package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.HashSet;

public class TestHashSet {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSet1(){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Honda");
        assertTrue(cars.contains("Honda"));
    }

    @org.junit.Test
    public void TestHashSet2(){
        Integer expectedSize = 1;
        HashSet<String> cars = new HashSet<String>();
        cars.add("Honda");
        cars.add("Honda");
        Integer actualSize = cars.size();

        assertEquals(expectedSize,actualSize);
    }
}
