import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter from where to where the prime numbers should be printed:");
        int m=scan.nextInt();
        int n=scan.nextInt();
        for(int i=m;i<=n;i++)
        {
            int factors =0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0) factors++;
            }
            if(factors<=2)
            {
                System.out.println("The number '"+i+"' is prime number.");
            }
            else
            {
                System.out.println("The number '"+i+"' is not prime number. It has '"+factors+"' factors.");
            }
        }
    }
}