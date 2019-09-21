import java.util.*;
public class leo40{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long nn = f(n);
        System.out.println(ff(nn));
    }

    private static int f(int nn) {
        int re=1;
        int t=1;
        while(nn>=t){
            re=re*t;
            t++;
            while (re%10==0) re/=10;
            re%=1000000000;
        }
        return re;
    }

    private static long ff(long nn) {
        long re=nn%10;
        while(nn!=0){
            if(re!=0){
                return re;
            }else{
                nn/=10;
                re=nn%10;

            }
        }
        return re;
    }
}