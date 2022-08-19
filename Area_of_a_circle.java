import java.util.*;
class soultion
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        s.close();
        double area = 3.14*r*r;
        System.out.format("%.2f",area);
    }
}