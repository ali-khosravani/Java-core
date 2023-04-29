package test.java.algorithm.sort;

import main.java.algorithm.sort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] array ={3,4,2,1,5};
        BubbleSort.bubbleSort(array);
        Assertions.assertArrayEquals(array,BubbleSort.bubbleSort(array));
    }
}