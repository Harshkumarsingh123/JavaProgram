
import java.util.Scanner;

class Fascinating {

  public static boolean isFascinating(int n) {

    if (n < 100) {
      return false;
    }
    int mul2 = n * 2;
    int mul3 = n * 3;
    int num[] = new int[10];
    String result = Integer.toString(n) + Integer.toString(mul2)+Integer.toString(mul3);
    for (int i = 0; i < result.length(); i++) {
      int val = result.charAt(i) -'0';
      num[val]++;
    }
    for (int i = 1; i < num.length; i++) {
      if (num[i] != 1)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    boolean result = isFascinating(n);
    System.out.println(result);
  }
}