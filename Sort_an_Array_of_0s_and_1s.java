import java.util.*;
class java
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
        Arrays.sort(arr);
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}