import java.util.Scanner;

class MaximumSubArray
{
    public static void printfun(int arr[], int n)
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum= sum+arr[j];
                if(sum>temp)
                {
                    temp=sum;
                }
            }
        }
        System.out.println("Maximum : "+temp);
      
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Size of Array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of Array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printfun(arr,n);
    }
}