class PowerOfFour 
{
    public boolean isPowerOfFour(int n) 
    {
        while(n!=0)
        {
            if(n==1)
             return true;
            if(n%4!=0)
              return false;
             n=n/4;  
        }
        
        return false;
    }
    public static  void main(String [] args)
    {
        int n=1;
        PowerOfFour obj=new PowerOfFour();
        System.out.println(obj.isPowerOfFour(n));
    }
}