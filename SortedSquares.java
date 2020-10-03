/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
also in sorted non-decreasing order.

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
*/

import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        int z = A.length;
        int array[] = new int[z];
        for (int i = 0; i < A.length; i++) {
            array[i] = (A[i] * A[i]);
        }
        Arrays.sort(array);

        return array;
    }
}
