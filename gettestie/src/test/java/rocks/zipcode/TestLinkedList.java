package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.LinkedList;

public class TestLinkedList {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestLinkedList1(){
        LinkedList<String> myLink = new LinkedList<String>();
        myLink.add("Honda");
        myLink.add("Toyota");
        myLink.add("Mazda");

        String expectedCar = "Honda";
        String actualCar = myLink.getFirst();

        assertEquals(expectedCar,actualCar);
    }
    @Test
    public void TestLinkedList2(){
        LinkedList<String> myLink = new LinkedList<String>();
        myLink.add("Honda");
        myLink.add("Toyota");
        myLink.add("Mazda");

        myLink.addFirst("Nissan");
        String expectedCar = "Nissan";
        String actualCar = myLink.getFirst();

        assertEquals(expectedCar,actualCar);
    }
}
