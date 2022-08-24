import java.util.*;
class prime
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int d=0,e=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]>=b && arr[i]<=c)
            {
               System.out.print(arr[i]+" ");
                d=1;
            }
        }
        if(d==0)
        {
            System.out.print("-1");
        }
    }
}