class IsPalindrome 
{
    public boolean isPalindrome(int x)
    {
        int temp=x;
        int rev=0;
        while(x>0)
        {
            int z=x%10;
            rev=rev*10+z;
            x=x/10;
        }
        if(temp==rev)
          return true;
        else
          return false;
    }

    public static void main(String [] args)
    {
        int x=-121;
        IsPalindrome obj=new IsPalindrome();
        boolean result=obj.isPalindrome(x);
        System.out.println(result);
    }
}