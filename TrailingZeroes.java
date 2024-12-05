import java.util.Scanner;
class TrailingZeroes
{
    public static int trailingZeroes(int n)
    {
        int count = 0;
        while (n > 0)
        {
            n/= 5; 
            count += n; 
        }
        return count;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println(trailingZeroes(n));
    }
}
