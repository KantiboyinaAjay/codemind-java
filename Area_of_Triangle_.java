import java.util.*;
class solution
{
    public static void main(String ar[])
    {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        scan.close();
        double s = (a+b+c)/2;
        double m = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",m);
    }
}