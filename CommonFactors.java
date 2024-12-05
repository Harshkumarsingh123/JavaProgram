import java.util.Scanner;

class CommonFactors {
    public static int commonFactors(int a, int b) {
        int count = 0;
        int small = (a > b) ? b : a;
        for (int i = 1; i <= small; i++) {
            if (a % i == 0 && b % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b = sc.nextInt();
        System.out.println(commonFactors(a, b));
    }
}