class MyPow 
{
    public double myPow(double x, int n)
    {
        double result=Math.pow(x,n);       
        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = -2;
        MyPow obj = new MyPow();
        double result = obj.myPow(x, n);
        System.out.println(String.format("%.5f", result));
    }

}