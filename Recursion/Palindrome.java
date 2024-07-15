package Recursion;

public class Palindrome {
    public static boolean checkpalindrome(String s,int i,int j)
    {
        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        else
        {
            return checkpalindrome(s, i+1, j-1);
        }
    }
    public static void main(String[] args) {
        String name = "aaa";
        boolean ispalindrome = checkpalindrome(name, 0,name.length()-1);
        if(ispalindrome)
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
