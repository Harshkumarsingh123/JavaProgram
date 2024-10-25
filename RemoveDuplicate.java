class RemoveDuplicate
{
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        int result = 1;
        if (n <= 1)
            return result;

        for (int i = 1; i < n; i++)
        {
            if (nums[i] != nums[i - 1]) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int nums[]={0};
        RemoveDuplicate obj=new RemoveDuplicate();
        int result=obj.removeDuplicates(nums); 
        System.out.println(result);
    }
}