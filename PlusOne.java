import java.util.Arrays;

class PlusOne
{
    public int[] plusOne(int[] digits)
    {
        
        int len = digits.length;
        for(int i=len-1; i>=0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
    
            digits[i] = 0;
        }
                int[] arr = new int[len+1];
                arr[0] = 1;
                
                return arr;
    }
    public static void main(String [] args)
    {
        int [] digits={9,9,9,9};
        PlusOne obj=new PlusOne();
        int result[]=obj.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}