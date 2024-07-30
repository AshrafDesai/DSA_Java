package Recursion;

public class PhoneKeypad {
    public static void solve(String digits, String output, int index, String[] mapping) {
        if (index >= digits.length()) 
        {
            System.out.println(output);
            return;
        }
        
        int number = digits.charAt(index) - '0';
        String value = mapping[number];
        
        for (int i = 0; i < value.length(); i++) 
        {
            solve(digits, output + value.charAt(i), index + 1, mapping);
        }
    }
    
    public static void phonekeypad(String digits) 
    {
        if (digits == null || digits.length() == 0) 
        {
            System.out.println("No digits provided.");
            return;
        }
        
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String output = "";
        int index = 0;
        
        solve(digits, output, index, mapping);
    }
    
    public static void main(String[] args) {
        String digits = "23";
        phonekeypad(digits);
    }
}
