/*Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

 

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58*/



class SumOddSubarray {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            result += ((i + 1) * (n - i) + 1) / 2 * arr[i];

        }
        return result;
    }

    public static void main(String[] args) {
        SumOddSubarray soa = new SumOddSubarray();
        int arr[] = new int[] { 1, 4, 2, 5, 3 };
        int result = soa.sumOddLengthSubarrays(arr);
        System.out.println("Sum of all the elements with odd number of length of subarrays is " + result);

    }

}