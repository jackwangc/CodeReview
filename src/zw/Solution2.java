package zw;

import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n];
        for (int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.print(maxSubArrayLen(num,k));
    }
    public static int maxSubArrayLen(int[] nums, int k) {
        if (nums.length == 0) return 0;
        int sum = 0, max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
    }
}
