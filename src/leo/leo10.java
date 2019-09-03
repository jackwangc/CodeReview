import java.util.*;

public class leo10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int[] nums = new int[input.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(input[i].trim());
        }
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==0) result+=1;
            }
        }
        System.out.println(result);

    }





}
