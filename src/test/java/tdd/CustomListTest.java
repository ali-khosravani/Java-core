package test.java.tdd;

import main.java.tdd.CustomList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        List<Object> list = new CustomList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned(){
        List<Object> list = new CustomList<>();
        list.add(null);
        assertFalse(list.isEmpty());
    }

    @Test
    public void givenListWithAnElement_whenSize_thenOneIsReturned(){
        List<Object> list = new CustomList<>();
        list.add(null);
        assertEquals(1 , list.size());
    }

    @Test
    public void givenListWithAnElement_whenGet_thenThatElementIsReturned(){
        List<Object> list = new CustomList<>();
        list.add("Ali");
        Object element = list.get(0);

        assertEquals("Ali" , element);
    }

    @Test
    public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement(){
        List<Object> list = new CustomList<>();
        boolean succeeded = list.add(null);

        assertTrue(succeeded);
    }

    @Test
    public void givenListAnElement_whenAnotherIsAdded_thenGetReturnsBoth(){
        List<Object> list = new CustomList<>();
        list.add("Ali");
        list.add("Khosravani");

        Object element0 = list.get(0);
        Object element1 = list.get(1);

        assertEquals("Ali" , element0);
        assertEquals("Khosravani" , element1);

    }
}