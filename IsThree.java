import java.util.Scanner;

class IsThree {
    public static boolean isThree(int n) {

        int count = 1;
        int i = 2;
        while (n >= i) {
            int z = n % i;
            if (z == 0) 
            {
                count++;
            }
            i++;
        }
        if (count == 3)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(isThree(n));
    }
}