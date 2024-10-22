package JavaProgram;
class Mysqrt
{
    public int mySqrt(int x) 
    {
        int n=1,count=0;
        while(x>0)
        {
           x=x-n;
           n=n+2;
           if(x>-1)
           {
            count++;
           }
          
           
        }
        return count;
    }
    public static void main(String [] args)
    {
        int x=16;
        Mysqrt obj=new Mysqrt();
        System.out.println(obj.mySqrt(x));
    }
}