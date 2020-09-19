/*
Input: [4,1,2,1,2]
Output: 4
*/
import java.util.*;
public class SingleNUmber 
{
    public int singleNumber(int[] nums) 
    {
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            if(!s.contains(i))s.add(i);
            else s.remove(i);
        }
        int temp=0;
        for(int i:s)temp=i;
        
        return temp;
        
    }
    public static void main(String args[])
    {
        SingleNUmber sn = new SingleNUmber();
        int []nums = new int[]{4,1,2,1,2};
        int result = sn.singleNumber(nums);
        System.out.println(result);

    }
    
}
