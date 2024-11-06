class CheckPerfectNumber
{
    public boolean checkPerfectNumber(int num) 
    {
        int count=0;
        for(int i=1;i<num;i++)
        {
               if(num%i==0)
               {
                count=count+i;
               }
        }
        if(count==num)
            return true;
        else
            return false;
    }
    public static void main(String [] args)
    {
        int num=7;
        CheckPerfectNumber obj=new CheckPerfectNumber();
        System.out.println(obj.checkPerfectNumber(num));
    }
}