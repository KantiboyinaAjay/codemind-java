import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        int[] arr1 = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            arr1[i]=scan.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+arr1[i]+" ");
        }
    }
}