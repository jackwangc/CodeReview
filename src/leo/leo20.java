import java.util.*;

public class leo20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int re = solution(n,m);

        System.out.print(re);
    }

    private static int solution(int n, int m) {
        int result=factorial(n)%1000000007/(factorial(n-m)*factorial(m));
        return  result;
    }

    public static int factorial(int x){
        if(x == 0)
            return 1;
        for(int i = x-1; i > 0; i--){
            x*=i;
        }
        return x;
    }
}
