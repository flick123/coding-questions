package org.example;

public class LengthOfShortestSubArray {
    public static int smallestSubarray(int[] a,int k){
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; ++i) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == k) {
                    result = Math.min(result, (j - i + 1));
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 2, 1} ;
        int k = 12;
        int r=smallestSubarray(arr,k);
        if (r == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(r);
        int[] arr1 = {5, 8, 50, 4};
        int m = 50;
        int r1=smallestSubarray(arr1,m);
        if (r1 == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(r1);
    }
}
