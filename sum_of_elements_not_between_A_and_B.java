import java.util.*;
class sum
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int d=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]>=b && arr[i]<=c)
            {
                continue;
            }
            d+=arr[i];
        }
        System.out.print(d);
    }
}