import java.util.Scanner;
public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        long a, b, c;
        long l, r;
        int ans = 0;
        for (a = 1; a <= L / 3; a++) {
            l = a + 1;
            r = L - a - 1;
            while (l < r) {
                b = (l + r) / 2;
                c = L - a - b;
                if (a * a + b * b == c * c) {
                    ans++;
                    break;
                } else if (a * a + b * b < c * c) {
                    l = b + 1;
                } else {
                    r = b - 1;
                }
            }
        }
        System.out.println(ans);
    }
}
