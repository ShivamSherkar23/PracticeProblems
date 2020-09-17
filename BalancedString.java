/*
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
*/

public class BalancedString 
{
    public static int balancedStringSplit(String s) 
    {
        int count = 0, sum = 0;
        for(char c : s.toCharArray()) 
        {
            if(c == 'L')
            {
                sum--;
            }
            else
            {
                sum++;
            }
            if(sum == 0)
            {
                count++;
            }
        }
        return count;   
    }

    public static void main(String args[])
    {
        String s = "RLRRLLRLRL";
        int result = balancedStringSplit(s);
        System.out.println("output: "+result);   
    }
    
}
