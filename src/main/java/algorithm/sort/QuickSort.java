package main.java.algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    private static void quickSort(int[] array , int begin , int end) {
        if (begin >= end) {
            return;
        } else {
            int temp = partition(array,begin , end);
            quickSort(array,begin,temp-1);
            quickSort(array,temp+1,end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int x = array[end];
        int i = begin - 1;
        for (int j = begin; j < end; ++j) {
            if (array[j] <= x) {
                ++i;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        ++i;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        //int array[]={5,4,3,2,1,9,14,6,25,17,19,11,10,8};
        int [] arr={6,5,3,1,4,7,2,8};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
