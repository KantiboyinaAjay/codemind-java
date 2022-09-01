import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double d = Math.pow(a,b);
        System.out.print((int)d%c);
    }
}