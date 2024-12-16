import java.util.Scanner;
class SmallestNumber
{
    public static int smallestNumber(int n, int t)
    {
        int temp,pro;
        for(int i=n;;i++)
        {
        
            pro=1;
            temp=i;
            while(temp>0)
            { 
                int z=temp%10;
                pro=pro*z;
                temp=temp/10;
                
            }
            if(pro%t==0)
                return i;
        }

    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n");
        int n=sc.nextInt();
        System.out.println("Enter the number t");
        int t=sc.nextInt();
        System.out.println(smallestNumber(n, t));
    }
}