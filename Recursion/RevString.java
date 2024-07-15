package Recursion;

public class RevString {
    public static void revstring(int i,int j,char[] s)
    {
        if(i>=j)
        {
            return;
        }
        swap(i,j,s);
       
        revstring(i+1, j-1, s);
    }
    public static void swap(int i, int j, char[] s) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    public static void main(String[] args) {
        String name = "ashraf";
        char[] charArray = name.toCharArray();
        System.out.println("OG String: " + name);
        revstring(0,charArray.length-1,charArray);
        String reversedString = new String(charArray);
        System.out.println("Reversed String: " + reversedString);
    }
}
