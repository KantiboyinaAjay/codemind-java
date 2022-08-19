import java.util.*;
class KCPD
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.print(2*a*b*c*512);
    }
}