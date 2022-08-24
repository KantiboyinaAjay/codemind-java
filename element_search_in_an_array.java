import java.util.*;
class average
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
        scan.close();
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(b==arr[i])
            {
                System.out.print("True");
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
    }
}