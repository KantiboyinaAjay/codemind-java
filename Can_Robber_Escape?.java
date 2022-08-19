import java.util.*;
class robber
{
    public static void main(String aer[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            {
                s++;
            }
        }
        if(s<=2)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}