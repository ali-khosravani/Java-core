package main.java.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 19, 25, 29, 36, 45, 48, 49, 50, 55, 60, 95, 115, 125, 145, 168, 198, 210, 225};
        binarySearch(arr, 0, arr.length, 26);
    }

    public static void binarySearch(int[] arr, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first<= last){
            if (arr[mid] == key){
                System.out.println("Found "+ key + " at index " + mid);
                break;
            }
            else if (arr[mid] <key){
                first = mid +1;
            }
            else {
                last = mid-1;
            }
            mid = (first+last)/2;

        }
        if (first>last){
            System.out.println("Not Found");
        }
    }
}