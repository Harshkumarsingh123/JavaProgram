import java.util.Scanner;

class StrStr 
{
    public static int strStr(String haystack, String needle) 
    {
        if (haystack.contains(needle)) 
        { 
            return haystack.indexOf(needle);
        } 
       return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String");
        String haystack=sc.nextLine();
        System.out.println("Enter the Second String");
        String needle=sc.nextLine();
        System.out.println(strStr(haystack,needle));
    }
}