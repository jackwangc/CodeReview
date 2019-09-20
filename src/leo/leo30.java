import java.util.Scanner;

public class leo30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.substring(1,str.length()-1).split(", ");
        int[] m = new int[strs.length];
        for (int i = 0; i < m.length; i++) {
            m[i] = Integer.parseInt(strs[i]);
        }
        int r = f(m);
        System.out.println(r);
    }

    public static int f(int[] m) {
        int s = 0;
        int mSum = Integer.MIN_VALUE;
        for (int val : m) {
            s = s <= 0 ? val : s + val;
            mSum = Math.max(mSum, s);
        }
        return mSum;
    }
}
