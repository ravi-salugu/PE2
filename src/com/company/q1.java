import java.util.Scanner;

public class q1 {
    public static boolean CheckPalindrome(String str)
    {
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter number or string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        boolean b=CheckPalindrome(str);
        System.out.println(b);

    }
}
