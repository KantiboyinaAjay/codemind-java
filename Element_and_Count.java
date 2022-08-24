import java.util.*;
class sum
{
    public static void main(String asd[])
    {
        HashMap<Integer,Boolean>set=new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        double d=0,e=0;
        for(int i=0;i<a;i++)
        {
            if(set.get(arr[i])==null)
            {
                int c=0;
                for(int j=0;j<a;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        c++;
                    }
                }
                System.out.print(arr[i]+" "+c+" ");
                set.put(arr[i],true);
            }
            
        }
    }
}