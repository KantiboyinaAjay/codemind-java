import java.util.*;
class java
{
    public static void main(String ASD[])
    {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            l.add(arr[i]*arr[i]);
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}