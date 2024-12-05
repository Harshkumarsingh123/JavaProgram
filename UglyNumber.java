import java.util.Scanner;

class UglyNumber {

    public boolean isUgly(int n) {
        if (n < 1)
            return false;
        int fact[] = { 2, 3, 5 };
        for (int i : fact) {
            while (n % i == 0) {
                n = n / i;
            }
        }
        return n==1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UglyNumber obj = new UglyNumber();
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        boolean result = obj.isUgly(n);
        System.out.println(result);

    }
}