import java.lang.Math;
class SumOfEncryptedInt
{
    public static int sumOfEncryptedInt(int[] nums) 
    {
        int sum=0;
        for(int i:nums)
        {
            sum+=encrypt(i);
        }
        return sum;
    }
        public static int encrypt(int i)
        {
            int max=0,temp=0;
            while(i>0)
            {
                int z=i%10;
                max=Math.max(max,z);
                i=i/10;
                temp=temp*10+1;
            }
            return max*temp;
        }
    
    public static void main(String [] args)
    {
        int nums[]={1,2,3};
        System.out.println(sumOfEncryptedInt(nums));
    }
}