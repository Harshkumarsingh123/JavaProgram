class FindMedianSortedArrays 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double sum=0;
        int arr[]=new int[nums1.length + nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr[nums1.length+i]=nums2[i];
        }
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(arr.length>1)
        { 
            int l=arr.length/2;
            if(arr.length%2==0)
            {
                sum=arr[l]+arr[l-1];
                sum=sum/2;
            }
            else
            {
                
                System.out.println(l);
                sum=arr[l];

            }
        }
        else
        {
            sum=arr[0];
        }
      return sum;
    }
    public static void main(String [] args)
    {
        int nums1[]={2,2,4,4};
        int nums2[]={2,2,2,4,4};
        FindMedianSortedArrays obj=new FindMedianSortedArrays();
        double result=obj.findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}