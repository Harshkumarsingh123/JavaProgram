class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n != 0) {
            if (n == 1)
                return true;
            if (n % 3!= 0)
                return false;
            n = n / 3;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 12;
        PowerOfThree obj = new PowerOfThree();
        System.out.println(obj.isPowerOfThree(n));
    }
}