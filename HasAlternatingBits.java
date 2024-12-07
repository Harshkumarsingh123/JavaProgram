import java.util.Scanner;
class HasAlternatingBits
 {
    public static boolean hasAlternatingBits(int n) 
    {
        int temp=-1;
        while(n>0)
        {
            int z=n%2;
            if(temp==z)
                return false;
            temp=z;
            System.out.println(z);
            n/=2;
        }    
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber : ");
        int n=sc.nextInt();
        System.out.println(hasAlternatingBits(n));
    }
}