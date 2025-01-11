class SingleNonDuplicate {
    public static int singleNonDuplicate(int[] nums) 
    {
        if(nums.length==1)
            return nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                    i++;
                    break;
                }     
            }
            if(count==0)
            {
                count=nums[i];
                break;
            }
        }
       return count;
    
    }
    public static void main(String[] args) 
    {
        int nums[]={1,1,2,2,3,3,4};
        System.out.println(singleNonDuplicate(nums));
    }
}