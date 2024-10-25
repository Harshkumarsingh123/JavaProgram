class RemoveElement {
    public int removeElement(int[] nums, int val) {
        
        int result = 0;
        for (int i = 0; i <nums.length; i++) 
        {
            if (nums[i] != val) 
                 nums[result++]=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 3,2,3,2,3,4,4,5,6,2,3};
        int val = 3;
        RemoveElement obj = new RemoveElement();
        int result=obj.removeElement(nums,val);
        for(int i=0;i<result;i++)
        {
            System.out.println(nums[i]+" ");
        }
        
    }
}
