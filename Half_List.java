import java.util.*;
class wave
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
        scan.close();
        for(int i=a-1;i>=a/2;i--)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<a/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}