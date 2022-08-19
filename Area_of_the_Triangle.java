import java.util.*;
class solution
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.close();
        double se = (a+b+c)/2;
        double m = Math.sqrt(se*(se-a)*(se-b)*(se-c));
        System.out.format("%.2f",m);
    }
}