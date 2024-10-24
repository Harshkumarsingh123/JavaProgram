class AddDigits
{
    public int addDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            int z=num%10;
            sum=sum+z;
            num=num/10;
        }
        if(sum>9)
          return addDigits(sum);
        else
           return sum;

    }
    public static void main(String [] args)
    {
        int num=19;
        AddDigits obj=new AddDigits();
        int result=obj.addDigits(num);
        System.out.println(result);
    }
}