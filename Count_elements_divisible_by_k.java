import java.util.*;
class divisible
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] arr = new int[a];
        int c=0;
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]%b==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}