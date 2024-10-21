class Divide {
    public int divide(int dividend, int divisor) {
        int result;
        if (dividend > Integer.MAX_VALUE || dividend < Integer.MIN_VALUE) {
            result = 0;
        } else if (dividend == Integer.MIN_VALUE && divisor == -1)
            result = Integer.MAX_VALUE;
        else {
            result = dividend / divisor;
        }
        return result;
    }
    public static void main(String[] args) {
        int dividend = 0;
        int divisor = 1;
        Divide obj = new Divide();
        int result = obj.divide(dividend, divisor);
        System.out.println(result);
    }
}