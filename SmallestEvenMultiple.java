import java.util.Scanner;

class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        for (int i = n;; i++) {
            if (i % 2 == 0 && i % n == 0) {
                return i;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println(smallestEvenMultiple(n));

    }
}