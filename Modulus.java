import java.util.*;
class KCPD
{
    public static void main(String ads[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.print(a%b);
    }
}