class FibNumber
{
    public int fib(int n) 
    {
        int a=0,b=0,c=1;
        if(n==0)
          return 0;
        else if(n==1)
            return 1;
        else
        {
           while(n>1)
           {
              a=b;
              b=c;
              c=a+b;
              n--;
           } 
           return c;      
        }      
    }
    public static void main(String [] args)
    {
        int n=2;
        FibNumber obj=new FibNumber();
        System.out.println(obj.fib(n));
    }
}