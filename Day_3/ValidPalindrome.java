import java.util.*;
public class ValidPalindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        str=sb.toString();
        String rev="";
        for(int j=str.length()-1;j>=0;j--)
        {
            rev=rev+str.charAt(j);
        }
        if(str.equals(rev))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}      