class TwoSum 
{
    public int[] twoSum(int[] nums, int target)
    {
        int arr[]=new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
    
    public static void main(String [] args)
    {
        int nums[]={2,7,11,15};
        int target=9;
        TwoSum obj=new TwoSum();
        int res[]= obj.twoSum(nums,target);
        System.out.println(res[0]+" "+res[1]);
    }
}