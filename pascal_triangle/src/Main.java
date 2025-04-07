import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[][] a=new int[50][50];
        System.out.println("Enter number of rows in the pascal triangle:");
        int n=scan.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++) System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i) a[i][j]=1;
                else a[i][j]=a[i-1][j-1]+a[i-1][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}