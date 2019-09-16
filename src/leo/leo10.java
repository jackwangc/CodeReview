import java.util.*;

public class leo10 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(count(nums,s));
    }
    public static long count(int[] nums,int s) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Long,Integer> m = new HashMap<>();
        m.put(0l,-1);
        long result = 0;
        long tempsum = 0;
        for(int i = 0;i < nums.length;i++) {
            tempsum += nums[i];
            if(m.containsKey(tempsum - s))
                result = Math.max(i - m.get(tempsum - s),result);
            if(!m.containsKey(tempsum))
                m.put(tempsum,i);
        }
        return result;
    }
    public static int maxSubArrayLen1(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i=0; i<len; i++){
            sum += nums[i];
            if(sum == k) max = Math.max(max, i+1);
            if(map.containsKey(sum-k)) max = Math.max(max,i-map.get(sum-k));
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        if(max > 0) return max;
        else return 0;
    }

    public static int maxSubArrayLen2(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        int max = 0;
        int[] sums = new int[len];
        for(int i=0; i<len; i++){
            sum += nums[i];
            sums[i] = sum;
            if(sum == k) max = Math.max(max, i+1);
        }
        for(int i=0; i<len; i++){
            sum = sums[i];
            for(int j=0; j<i; j++){
                sum -= nums[j];
                if(sum == k) {
                    max = Math.max(max, i-j);//
                    break;
                }
            }
        }
        if(max > 0) return max;
        else return 0;
    }
}