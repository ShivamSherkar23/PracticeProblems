/*
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/

public class EvenNoOfDigits 
{
    public static int findNumbers(int[] nums) 
    {
        int res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(((int)Math.log10(nums[i])+1)%2==0)
            {
                res++;
            }
        }    
        return res;   
    }

    public static void main(String args[]) {
        int[] nums = new int[] { 12, 345, 2, 6, 7896 };
        int result = findNumbers(nums);
        System.out.println("number of elements with even number of digits are "+result);
    }
    
}
