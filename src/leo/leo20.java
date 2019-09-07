import java.util.*;

public class leo20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //int re = solution(n,m);

        System.out.print(n<m?0:10);
    }

//    private static int solution(int n, int m) {
//        if(n<m) return 0;
//        int result=factorial(n)/(factorial(n-m)*factorial(m));
//        return  result;
//    }
//
//    public static int factorial(int x){
//        if(x == 0)
//            return 1;
//        for(int i = x-1; i > 0; i--){
//            x*=i;
//        }
//        return x%1000000007;
//    }
//    public  static  int result=0;
//    public static int f(int n,int m){
//
//        if(n == 0){return result;}
//
//        for(int i=m; i<n; i++){
//
//                        if(i+1 > n) return result;
//                        f(n-1,i+1);
//                        str = str.substring(0, str.length()-2);
//                    }
//                return;
//            }

}
