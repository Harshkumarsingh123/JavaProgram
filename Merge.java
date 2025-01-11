import java.util.Arrays;
class Merge 
{
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums2[i]!=0)
            {
               nums1[m+j]=nums2[i]; 
               j++;
            }
        }
        for(int i=0;i<nums1.length-1;i++)
        {
            for(j=i+1;j<nums1.length;j++)
            {
                if(nums1[i]>nums1[j])
                {
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
                  
            }
        }
        for(j=0;j<nums1.length;j++)
        {
            System.out.print(nums1[j]+" ");
        }

    }
    public static void main(String [] args)
    {
        int [] nums1={1,2,3,0,0,0};
        int m=3;
        int [] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
    }
    
}