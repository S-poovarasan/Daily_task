import java.util.*;
public class Duplicte
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[]arr=new int[n];
      Set<Integer> set=new HashSet<>();
      ArrayList<Integer> li=new ArrayList<>();
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          if(set.contains(arr[i])
             li.add(arr[i]);
          else
            set.add(arr[i]);
        }
      System.out.print(li);
    }
  }
