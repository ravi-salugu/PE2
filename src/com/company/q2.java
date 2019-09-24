import java.util.Scanner;

public class q2 {

    public static boolean isPowerOfFour(int n)
    {
        if(n == 0)
            return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int num = scan.nextInt();
        boolean b=isPowerOfFour(num);
        System.out.println(b);
    }
}

