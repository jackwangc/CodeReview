import java.util.*;

public class leo30 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] scs = sc.nextLine().split("],");

        System.out.println();
    }



    public int maxArea(int[] height) {
        int m = 0, l = 0, r = height.length - 1;
        while (l < r) {
            m = Math.max(m, Math.min(height[l], height[r]) * (r - l));
            if (height[l] > height[r])
                r--;
            else
                l++;
        }
        return m;
    }
}
