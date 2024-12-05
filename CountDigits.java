import java.util.Scanner;

class CountDigits
{
    public static int countDigits(int num) {
        int temp = num;
        int count = 0;
        while (num > 0) {
            int z = num % 10;
            if (temp % z == 0)
                count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
}