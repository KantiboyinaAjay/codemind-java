import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                d++;
            }
        }
        System.out.print(d);
    }
}