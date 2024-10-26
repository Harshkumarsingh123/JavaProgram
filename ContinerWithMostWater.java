class ContinerWithMostWater
{
    public int maxArea(int[] height) 
    {
        int water=0;
        int left=0,right=height.length-1;
        while(left<right)
        {
            water=Math.max(water, Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right])
            right--;
            else
            left++;
        }
        return water;
    }
    public static void main(String [] args)
    {
        int height[]={1,8,6,2,5,4,8,3,7};
        ContinerWithMostWater obj=new ContinerWithMostWater();
        int result=obj.maxArea(height);
        System.out.println(result);
    }
}