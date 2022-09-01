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
        if(a%2==0)
        {
            for(int i=0;i<a;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            for(int i=0;i<a;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.print("0");
        }
    }
}