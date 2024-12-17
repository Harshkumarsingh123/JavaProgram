import java.util.Scanner;
class GetSneakyNumbers
{
    public static int[] getSneakyNumbers(int[] nums) 
    {   
        int l=0;
        int res[]=new int[nums.length];
        int count;
        for(int i=0;i<nums.length-1;i++)
        {
            count=1;
               for(int j=i+1;j<nums.length;j++)
               {
                  if(nums[i]==nums[j])
                  {
                    count++;
                  }
               }
              
            if(count==2)
            {
                res[l]=nums[i];
                l++;
            }    
        }
        int nums1[]=new int[l];
        for(int i=0;i<l;i++)
        {
            nums1[i]=res[i];
        }
        return nums1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the Number of elemts : ");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int res[]=getSneakyNumbers(nums);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
