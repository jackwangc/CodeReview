package beike0810_zds; /**
 * Created by YYM on 2019/8/10.
 */
import  java.util.*;
public class Test1 {
    public  static  void   main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N + 1];
        int[] v = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            v[i] = sc.nextInt();
        }
        int maxValue = knapsack(N, W, w, v);
        System.out.print(maxValue);
        System.out.println(" ");
        int maxValue1 = knapsack1(N, W, w, v);
        System.out.print(maxValue1);
    }

    public  static  int   knapsack( int N,int W,int []w,int []v){
        int [][]B=new int[N+1][W+1];
        for (int k=1;k<=N;k++){
            for (int cap=1;cap<=W;cap++){
                if(w[k]>cap) {
                    B[k][cap]=B[k-1][cap];
                }
                else {
                    int value1= B[k-1][cap-w[k]]+v[k];
                    int value2=B[k-1][cap];
                    B[k][cap]=(value1>value2)?value1:value2;
                }
            }
        }

        return  B[N][W];
    }

    public  static  int   knapsack1( int N,int W,int []w,int []v){
        int []F=new int[W+1];
        for (int i=0;i<=W;i++)
            F[i]=0;
        for (int k=1;k<=N;k++){
            for (int cap=W;cap>=w[k-1];cap--){
                F[cap]=Math.max(F[cap],F[cap-w[k-1]]+v[k-1]);
            }
        }
        for(int i=0;i<F.length;i++){
            System.out.print(F[i]+" ");
        }
        return  F[W];
    }
}
