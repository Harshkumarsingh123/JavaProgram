class Search
{
    public int search(int[] nums, int target)
    {

        int result=-1;

        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==target)
             {
                result=i;
             }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { -1,2,3,4,1, 3, 5 ,6};
        int target = -1;
        Search obj = new Search();
        int result = obj.search(nums, target);
        System.out.println(result);
    }
}