package rocks.zipcode;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestArrayList {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayList1(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Sony");
        arrList.add("Samsung");
        arrList.add("LG");

        String expectedBrand = "Apple";
        arrList.set(0,"Apple");
        String actualBrand = arrList.get(0);

        assertEquals(expectedBrand,actualBrand) ;
    }
}
