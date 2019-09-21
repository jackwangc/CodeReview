import java.util.Scanner;

public class leo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            System.out.println(getMinSumToN(num));
        }
    }

    private static String getMinSumToN(int num) {
        // 除首位的位数
        int n = num/9;
        int first = num % 9;
        String res = num%9 == 0?"":first + "";
        for (int i = 0; i < n; i++)
            res +="9";
        return res;
    }
}