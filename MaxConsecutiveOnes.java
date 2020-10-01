class MaxConsecutiveOnes
{
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]==0)
            {
                count=0;
            }
            else
            {
                count++;
                result  = Math.max(result,count);
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]=new int[]{1,0,1,1,1,1,0,1,0,0};
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        int result = mco.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
