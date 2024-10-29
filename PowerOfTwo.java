class PowerOfTwo
{
    public boolean isPowerOfTwo(int n)
    {
        while(n!=0)
        {
            if(n==1)
             return true;
            if(n%2!=0)
              return false;
              n=n/2; 
        }
        return false;
    }
    public static void main(String [] args)
    {
        int n= 10;
        PowerOfTwo obj=new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(n));
    }
}