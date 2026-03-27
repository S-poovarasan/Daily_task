import java.util.*;
public class SecondLarge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=Integer.MIN_VALUE;
        int secmax=max;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }
        }
        System.out.println(secmax);
    }
}