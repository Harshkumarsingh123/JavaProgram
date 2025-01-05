class EvenOddBits
{
    public static int[] evenOddBits(int n) {
        int countE=0,countO=0;
        int arr[]=new int[n+1];
        int j=0;
        while(n>0)
        {
            int z=n%2;
            arr[j]=z;
            j++;
            if(z==1)
            {
                if(j%2!=0)
                   countE++;
                else
                  countO++;   
            }
            n/=2;
        }
       int arr1[]={countE,countO};
        return arr1;
    }

    public static void main(String[] args) {
        int n = 2;
        int arr[] = evenOddBits(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}