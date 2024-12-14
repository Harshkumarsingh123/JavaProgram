import java.util.Scanner;
class LengthOfLastWord 
{
    public static int lengthOfLastWord(String s) 
    {
        int count=0;
        s=s.trim();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
                break;
            count++;    
        }
        return count;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine(); 
        System.out.println(lengthOfLastWord(s));
    }
}