import java.util.Scanner;
public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        long x, y, z, m ,n;
        int res = 0;
        for (x = 1; x <= p / 3; x++) {
            m = x + 1;
            n = p - x - 1;
            while (m <= n) {
                y = (m + n) / 2;
                z = p - x - y;
                if (x * x + y * y == z * z) {
                    res++;
                    break;
                } else if (x * x + y * y < z * z) {
                    m = y + 1;
                } else {
                    n = y - 1;
                }
            }
        }
        System.out.println(res);
    }
}
