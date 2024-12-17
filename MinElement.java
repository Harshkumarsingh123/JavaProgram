import java.util.Scanner;

class  MinElement 
{
    public static int minElement(int[] nums) 
    {
        int temp,sum;
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            temp=nums[i];
            
            while(temp>0)
            {
                int z=temp%10;
                sum=sum+z;
                temp=temp/10;
            }
            if(min>=sum)
            {
                min=sum;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the Number of elemts : ");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
       System.out.println(minElement(nums));
    }
}