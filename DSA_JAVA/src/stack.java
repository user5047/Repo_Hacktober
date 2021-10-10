import java.util.*;
public class stack
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		BinarySearch sol=new BinarySearch();
		if(sol.ispar(str)==true)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        char c[]=x.toCharArray();
        Stack<Character> st = new Stack<Character>();
        st.add('x');
        for(int i=0;i<c.length;i++)
        {
            if(!st.empty()){
            if(c[i]=='(')
            {
                st.push('(');
            }
            else if(c[i]==')')
            {
                if(st.peek()!='x' && st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    st.push(')');
                }
            }
            else if(c[i]=='[')
            {
                st.push('[');
            }
            else if(c[i]==']')
            {
                if(st.peek()!='x' &&st.peek()=='[')
                {
                    st.pop();
                }
                else
                {
                    st.push(']');
                }
            }
            else if(c[i]=='{')
            {
                st.push('{');
            }
            else if(c[i]=='}')
            {
                if(st.peek()!='x' && st.peek()=='{')
                {
                    st.pop();
                }
                else
                {
                    st.push('}');
                }
            }
            else{}
        }
        }
        if(st.peek()=='x')
        {
            st.pop();
        }
        return st.empty();
    }
}
