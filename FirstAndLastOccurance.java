class FirstAndLastOccurance
{
    public int [] searchRange(int[] nums, int target) 
    {

        int first=-1,last=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(first==-1)
                {
                    first=i;
                    last=i;
                }
                else
                  last=i;     
            }
        }
        int result[]={first,last};

        return result;
    }
    public static void main(String [] args)
    {
        int nums[]={1};
        int target=1;
        FirstAndLastOccurance obj=new FirstAndLastOccurance();
        int result[]=obj.searchRange(nums,target);
        System.out.println(result[0] + " " +result[1]);
    }
}