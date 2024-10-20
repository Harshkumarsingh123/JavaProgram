class SearchInsert {
    public int searchInsert(int[] nums, int target)
    {
        int arr[]=new int[nums.length+1];
        int result=0, i=0;

        for(i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        arr[nums.length]=target;
        for(i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>=arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }   
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                result=i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5 ,6};
        int target = 5;
        SearchInsert obj = new SearchInsert();
        int result = obj.searchInsert(nums, target);
        System.out.println(result);
    }
}