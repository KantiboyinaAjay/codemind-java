import java.util.*;
class java
{
    public static void main(String asd[])
    {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]!=0)
            {
                l.add(arr[i]);
            }
            else
            {
                l1.add(0);
            }
        }
        l.addAll(l1);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
        
    }
}