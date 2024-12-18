import java.util.Scanner;
class IsArraySpecial1
{
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) 
    {
      int temp[]=new int[nums.length];
      for(int i=1;i<nums.length;i++)
      {
        if (nums[i] % 2 != nums[i - 1] % 2) 
        {
            temp[i] = temp[i - 1];
        } else {
            temp[i] = i;
        }
      }
      boolean[] res = new boolean[queries.length];
      for (int i = 0; i < queries.length; i++) {
        res[i] = temp[queries[i][1]] <= queries[i][0];
    }
    return res;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts in array : ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the Elements of Array : ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int queries[][]={{0,1}};
      System.out.println(isArraySpecial(nums,queries));
    }
}