import java.util.Scanner;

class NumberOfSteps {
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0)
        {
          if(num%2==1)
             num--;
           else 
             num=num/2;  
          count++;   
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }
}