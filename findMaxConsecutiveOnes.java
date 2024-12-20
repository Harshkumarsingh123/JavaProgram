class findMaxConsecutiveOnes 
{
    public static  int findMaxConsecutiveOnes(int[] nums) 
    {
        int count = 0; 
        int max = 0; 
        for (int value : nums) 
        {
            if (value == 1) 
            { 
                count++;
            }
            else 
            {
               max = Math.max(max,count);
               count = 0; 
            }
        }
        max = Math.max(max,count);
        return max;
    }
    public static void main(String [] args)
    {
        int nums[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}