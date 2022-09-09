import java.util.*;
class fibonacci
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=0,d=1;
        System.out.print(b+" "+d+" ");
        int c = a-2;
        while(c!=0)
        {
            int e = b + d;
            b = d;
            d = e;
            System.out.print(e+" ");
            c--;
        }
    }
}