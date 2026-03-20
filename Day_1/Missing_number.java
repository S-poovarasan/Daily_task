import java.util.*;
public class Missing_number
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
            if(i!=n-1)
            sum+=arr[i];
        }
        int totalSum=n*(n+1)/2;
        System.out.println(totalSum-sum);
    }
}