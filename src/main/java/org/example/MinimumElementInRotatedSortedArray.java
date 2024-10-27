package org.example;

public class MinimumElementInRotatedSortedArray {

    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {

            if (arr[low] <= arr[high])
                return arr[low];


            int mid = (low + high) / 2;


            if (arr[mid] > arr[high])
                low = mid + 1;

            else
                high = mid;
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int[] a1 = {5, 6, 1, 2, 3, 4};
        int[] a2={1,2,3,4};
        System.out.println(findMin(a1));
        System.out.println(findMin(a2));
    }
}
