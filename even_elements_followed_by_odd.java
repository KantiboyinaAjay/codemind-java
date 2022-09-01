import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        int[] ar = new int[100];
        int[] ra = new int[100];
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        int q=0,w=0;
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]%2==0)
            {
                ar[q++] = arr[i];
            }
            else
            {
                ra[w++] = arr[i];
            }
        }
        int n=0;
        int m = q-1;
        int l = w-1;
        for(int i=0;i<=m;i++)
        {
            System.out.print(ar[i]+" ");
        }
        for(int i=0;i<=l;i++)
        {
            System.out.print(ra[i]+" ");
        }
    }
}