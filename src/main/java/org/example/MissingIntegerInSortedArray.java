package org.example;

public class MissingIntegerInSortedArray {

    public static int findMissing(int[] arr,int n) {
        int length = n + 1;
        int totalSum = length * (length + 1) / 2;

        int missingNumber;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }


        missingNumber = totalSum - arraySum;

        return missingNumber;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8};
        int n = arr.length;
        System.out.println(findMissing(arr, n));
    }

}
