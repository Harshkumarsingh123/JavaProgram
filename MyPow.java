class MyPow {
    public double myPow(double x, int n) {
        double result = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                result = result * x;
            }
        } else 
        {
            n=Math.abs(n);
            for (int i = 1; i<=n; i++) {
                result = result * (1 / x);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 2;
        MyPow obj = new MyPow();
        double result = obj.myPow(x, n);
        System.out.println(String.format("%.5f", result));
    }

}