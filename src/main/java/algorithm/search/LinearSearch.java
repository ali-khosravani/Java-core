package main.java.algorithm.search;


import java.util.ArrayList;
import java.util.Arrays;

class LinearSearch {

    static void linearSearch(int[] arr , int item) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == item) {
                list.add(j);
                count++;
            }
        }
        System.out.println(Arrays.toString(list.toArray()) + "\n" + count);
    }

    public static void main(String[] args) {
        linearSearch(new int[]{6, 5, 2, 5, 5, 5, 6, 5, 3, 4, 5, 6, 5},5);
    }
}
