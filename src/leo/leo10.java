import java.util.*;

public class leo10 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        int re = f(s);
        System.out.println(re);
    }

    private static int f(int[] s) {
        if(s.length==0) return 0;
        int r=s[0];
        for(int j=1;j<s.length;j++){
            r^=s[j];
        }
        return r;
    }

}