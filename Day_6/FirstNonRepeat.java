import java.util.*;
public class FirstNonRepeat
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            for(int i=0;i<n;i++)
            {
                if(map.get(arr[i])==1)
                {
                    System.out.println(arr[i]);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}