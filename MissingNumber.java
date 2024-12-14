import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int i=0;
        while(i<nums.length)
        {
            int z=nums[i];
            if(count!=z)
            {
                break;
            }
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts :");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the Elemnts ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNumber(nums));
    }
}