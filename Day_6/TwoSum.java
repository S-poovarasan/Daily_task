import java.util.*;
public class TwoSum {

    public static int[] twoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int current = nums[left] + nums[right];

            if (current == target) {
                return new int[]{left, right};
            } else if (current < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)        {
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        int[] result = twoSumSorted(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}