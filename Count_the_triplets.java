import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        for(int b=0;b<a;b++)
        {
            List<Integer> l = new ArrayList<>();
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
            int y=-1;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i!=j)
                    {
                        int m=arr[i]+arr[j];
                        for(int k=0;k<n;k++)
                        {
                            if(m==arr[k])
                            {
                                y=1;
                                l.add(m);
                            }
                        }
                    }
                }
            }
            if(y==-1)
                System.out.println(-1);
            else
                System.out.println(l.size()/2);
        }
    }
}