import java.util.Scanner;
class IsArraySpecial 
{
    public static boolean isArraySpecial(int[] nums) 
    {
        if(nums.length<1)
           return true;
        else
        {
            for(int i=1;i<nums.length;i++)
            {
                int y=nums[i-1]%2;
                int z=nums[i]%2;
                if(y==z)
                    return false;
            }
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts in array : ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the Elements of Array : ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(isArraySpecial(nums));
    }
}