import java.util.Scanner;

class MaxMin
{
    public static void printfun(int arr[], int n)
    {
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
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