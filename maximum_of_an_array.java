import java.util.*;
class average
{
    static void minimum(int n,int arr[])
    {
        int m = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        System.out.print(m);
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();
        minimum(a,arr);
    }
}