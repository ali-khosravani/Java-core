package test.java.algorithm;

import main.java.algorithm.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] array ={3,4,2,1,5};
        int len = array.length;
        BubbleSort.bubbleSort(array,len);
        Assertions.assertArrayEquals(array,BubbleSort.bubbleSort(array,len));
    }
}