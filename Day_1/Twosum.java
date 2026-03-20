import java.util.*;
public class Twosum
{
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int[]result=new int[2];
            int target=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]+arr[j]==target)
                    {
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
            System.out.print(Arrays.toString(result));
    }
}