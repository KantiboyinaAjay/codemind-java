import java.util.*;
class ajay
{
    public static void main(String ay[])
    {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        scan.close();
        double c = (a+b)/2;
        System.out.format("%.4f",c);
    }
}