import java.util.*;
class fibonacci
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=0,d=1;
        if(a==0)
        {
            System.out.print("True");
        }
        else
        {
            while(a!=0)
            {
                int e = b + d;
                b = d;
                d = e;
                if(a==e)
                {
                    System.out.print("True");
                    break;
                }
                else if(e>a)
                {
                    System.out.print("False");
                    break;
                }
            }
        }
    }
}