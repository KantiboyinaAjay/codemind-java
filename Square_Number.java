import java.util.*;
class SQUARE
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int b = a;
        double c = Math.sqrt(b);
        c = Math.round(c);
        if(a==c*c)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}