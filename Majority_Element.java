import java.util.*;
class java
{
    public static void main(String asd[])
    {
        ArrayList<Integer> as = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        int d=0,x=0,m=0;
        for(int i=0;i<a;i++)
        {
            int c=0;
            for(int j=0;j<a;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>=(a/2))
            {
                System.out.print(arr[i]);
                break;
            }
            
        }
    }
}