package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.HashMap;

public class TestHashMap {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMap1(){
        Integer expectedSize = 3;
        HashMap<String, Integer> fruitBasket = new HashMap<>();
        fruitBasket.put("Apples", 2);
        fruitBasket.put("Oranges", 1);
        fruitBasket.put("Lychee", 10);
        Integer actualSize = fruitBasket.size();
        assertEquals(expectedSize,actualSize);
    }
}
