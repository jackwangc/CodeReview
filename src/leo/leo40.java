import java.util.Scanner;
public class leo40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        long res = func(n, m);
        System.out.println(res%1000000007);
    }

    private static long func(int n, int m) {
        if (n == 1 || m == 0) {
            return 1;
        }
        if (m == 1) {
            return n;
        }
        long res = 0;
        for (int i = 0; i < m; i++) {
            res += func(i + 1, m - i - 1) * cal(i + 1, n);
        }
        return res;
    }

    /**
     * 计算排列组合 C_m^(i)
     * @param i
     * @param n
     * @return
     */
    private static long cal(int i, int n) {
        if(i<=1){
            return (long)n;
        }
        long x = 1;
        long y = 1;
        int t = n;
        for (int c = 0; c < i; c++,t--) {
            x *= t;
        }

        for (int c = i;c > 1;c--) {
            y *= c;
        }
        return x /y;
    }
}