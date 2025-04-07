import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int fact=1,i,n;
        System.out.println("Enter any number:");
        n=scan.nextInt();
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" = "+fact);
    }
}