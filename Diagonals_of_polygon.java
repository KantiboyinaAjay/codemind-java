import java.util.*;
class diagonals
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int m = (n*(n-3))/2;
        System.out.print(m);
    }
}