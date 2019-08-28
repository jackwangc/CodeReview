package javalearn;

import java.util.Scanner;
public class Second {
    static int N=10000005;
    static int M=1005;
    static boolean[] prime = new boolean[N];
    static int[] p = new int[N];
    static int[] pri = new int[M];
    static int[] num = new int[M];
    static int k,cnt,tmp,tmp1,count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isprime();
        while (n>=0){
            count=0;
            tmp= (int) (Math.sqrt(2.0)*n);
            tmp1=2*n;
            Find(n);
            dfs(0,1);
            System.out.println(count);
            n--;
        }
        System.out.println(0);
    }
    public static void isprime(){
        k = 0;
        int i,j;
        for(i=2;i<N;i++)
        {
            if(prime[i])
            {
                p[k++]=i;
                for(j=i+i;j<N;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
    }
    public static void Find(int n) {
        cnt=0;
        int t=(int)Math.sqrt(n*1.0);
        int i;
        int a;
        for(i=0;p[i]<=t;i++)
        {
            if(n%p[i]==0)
            {
                a=0;
                pri[cnt]=p[i];
                while(n%p[i]==0)
                {
                    a++;
                    n/=p[i];
                }
                num[cnt]=2*a;
                cnt++;
            }
        }
        if(n>1)
        {
            pri[cnt]=n;
            num[cnt]=2;
            cnt++;
        }
    }
    public static void dfs(int dept, long product)
    {
        product = 1;
        if(dept==cnt)
        {
            if(product%2==0&&product>tmp&&product<tmp1)
                count++;
            return;
        }
        for(int i=0;i<=num[dept];i++)
        {
            dfs(dept+1,product);
            product*=pri[dept];
        }
    }
}
