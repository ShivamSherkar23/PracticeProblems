/*
Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
Output: 4
Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
*/

public class GoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int counter = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String args[]) {
        GoodTriplets gt = new GoodTriplets();
        int[] arr = new int[] { 3, 0, 1, 1, 9, 7 };
        int a = 7, b = 2, c = 3;
        int result = gt.countGoodTriplets(arr, a, b, c);
        System.out.println("no of good pairs are " + result);
    }

}
