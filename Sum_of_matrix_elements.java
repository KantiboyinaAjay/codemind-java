import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                s+=arr[i][j];
            }
        }
        System.out.print(s);
    }
}