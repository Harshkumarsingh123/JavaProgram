class CountBits
{
    public static int[] countBits(int n) 
    {
        int arr[]=new int[n+1];

        int i=0,j=0,count;
        while(i<=n)
        {
            int temp=i;
            count=0;
            while(temp>0)
            {
                int z=temp%2;
                if(z==1)
                  count++;
                temp/=2;    
            }
            arr[j]=count;
            i++;j++;
        }  
        return arr;
    }
    public static void main(String [] args)
    {
        int n=2;
        int arr[]=countBits(n);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}