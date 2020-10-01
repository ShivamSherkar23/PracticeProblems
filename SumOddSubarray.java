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