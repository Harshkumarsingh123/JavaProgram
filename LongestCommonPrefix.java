import java.util.Arrays;
import java.util.Scanner;
class  LongestCommonPrefix 
{
    public static String longestCommonPrefix(String[] strs) 
    {
         if (strs == null || strs.length == 0)
                return "";
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length - 1];
            int ch = 0;
            while(ch < first.length())
            {
                if (first.charAt(ch) == last.charAt(ch))
                    ch++;
                else
                    break;
            }
            return ch == 0 ? "" : first.substring(0, ch);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elemnts in string :");
        int n=sc.nextInt();
        String strs[]=new String[n];
        System.out.println("Enter the String");
        for(int i=0;i<n;i++)
        {
            strs[i]=sc.next();
        }
        System.out.println(longestCommonPrefix(strs));
        
    }

}