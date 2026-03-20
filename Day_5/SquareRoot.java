import java.util.*;
public class SquareRoot
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left=0;
        int right=n;
        while(left<=right) 
        {
            int mid=left+(right-left)/2;
            if(mid*mid==n) 
            {
                System.out.println(mid);
                return;
            } 
            else if(mid*mid<n) 
            {
                left=mid+1;
            } 
            else 
            {
                right=mid-1;
            }
        }
        System.out.println(right);
    }
}