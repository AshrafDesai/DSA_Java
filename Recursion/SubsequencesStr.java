package Recursion;

public class SubsequencesStr {
    public static void solve(String str, String output, int index) 
    {
        if (index >= str.length()) 
        {
            if (!output.isEmpty()) 
            {
                System.out.println(output);
            }
            return;
        }

        solve(str, output + str.charAt(index), index + 1);
        solve(str, output, index + 1);
    }

    public static void subsequencesstr(String str) 
    {
        solve(str, "", 0);
    }

    public static void main(String[] args) 
    {
        String str = "abc";
        System.out.println("Subsequences:");
        subsequencesstr(str);
    }
}
