import java.util.Stack;

class IsValid {

    public static boolean isValid(String s)
    {
         
        String open="{[(";
        String close="}])";
        Stack<Character> st=new Stack<>();
        for(char x:s.toCharArray())
        {
            if(open.indexOf(x)!=-1)
            {
                st.push(x);
            }
            else if(close.indexOf(x)!=-1)
            {
                if(st.isEmpty())
                   return false;
                if(open.indexOf(st.pop())!=close.indexOf(x))
                  return false;   
            }
        }
          return st.isEmpty();
       
    }

    public static void main(String[] args) {

        String s = "(){}]";
        System.out.println(isValid(s));
    }
}