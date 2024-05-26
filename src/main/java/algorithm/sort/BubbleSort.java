package main.java.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] sort_arr) {
        int len = sort_arr.length;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - 1; ++j) {
                if (sort_arr[j+1]<sort_arr[j]){
                    int swap =sort_arr[j];
                    sort_arr[j]=sort_arr[j+1];
                    sort_arr[j+1]=swap;
                }
            }
        }
        return sort_arr;
    }

    public static void main(String[] args) {
        int[] array={10,5,6,9,2,1,4,5,8,14,13,3,16,20,19,7,0};
        System.out.println(Arrays.toString(bubbleSort(array)));

    }
}
