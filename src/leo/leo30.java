import java.util.Scanner;

public class leo30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            System.out.println(maxConLen(nums));
        }
    }

    private static int maxConLen(int[] nums) {
        if(nums.length<=1) return nums.length;
        int res = 0;
        // 得出累加和数组
        int[] acc = new int[nums.length];
        for (int i = 1; i < nums.length; i++)
            acc[i] = acc[i-1] + nums[i-1];
        // 得出符合完美序列的和
        boolean[] fit = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++)
            fit[i] = nums[i]>=acc[i]?true:false;
        // 找出连续为true最长的长度
        int maxLen = 0;
        int cnt =0;
        for (int i = 0; i < nums.length; i++) {
            if(fit[i] == false){
                maxLen = Math.max(maxLen,cnt);
                cnt = 0;
            }
            cnt++;
        }
        return maxLen;
    }
}
