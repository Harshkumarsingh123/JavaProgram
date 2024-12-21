import java.util.Scanner;
class NumberOfDigitOne
{
    public static int countDigitOne(int n)
    {
        int count=0;
        for(int i=1;i<=n;i*=10)
        {
            int z=i*10;
            count+=(n/z)*i+Math.min(Math.max(n%z-i+1,0),i);
        }
        return count;
       
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        System.out.println(countDigitOne(n));

    }
}