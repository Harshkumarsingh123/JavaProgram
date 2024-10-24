class Reverse1
{
   public int reverse(int x) 
   {
        long result = 0;
        while (x != 0)
        {
            result = result * 10 + x % 10;
            x =x/ 10;
        }
    return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) ? 0 : (int) result;
   }
  public static void main(String [] args)
  {
    int x=-123;
    Reverse1 obj=new Reverse1();
    int result=obj.reverse(x);
    System.out.println(result);
  }
}