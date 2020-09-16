/*
Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.
*/

import java.util.*;

class XORArray {
    public static int xorOperation(int n, int start) {
        ArrayList<Integer> arr = new ArrayList<>();
        int xor = 0;
        for (int i = 0; i < n; i++) {
            arr.add(start + 2 * i);
            xor = arr.get(i) ^ xor;
        }
        return xor;
    }

    public static void main(String args[]) {
        int n = 5;
        int start = 0;
        int result = xorOperation(n, start);
        System.out.println("final result after xor operation: " + result);

    }
}