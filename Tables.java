import java.util.*;
class tables
{
    public static void main(String ass[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i=1;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.println(a+" x "+i+" = "+(a*i));
            }
        }
    }
}