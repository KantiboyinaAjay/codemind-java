import java.util.*;
class solution
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        double c = s.nextDouble();
        s.close();
        double f = 32+(c*9/5);
        System.out.format("%.2f",f);
    }
}