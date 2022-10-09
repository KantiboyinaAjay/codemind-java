import java.util.*;
class java
{
    public static void main(String asd[])
    {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scan.nextInt();
        }
        int m = scan.nextInt();
        int[] ind = new int[m];
        for(int i=0;i<m;i++)
        {
            ind[i]=scan.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            l.add(ind[i],nums[i]);
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}