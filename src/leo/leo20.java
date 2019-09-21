import java.util.Scanner;

public class leo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] re = new int[t];
        for (int i = 0; i < t; i++) {
            op=0;
            int[] abpq =new int[4];
            abpq[0]=sc.nextInt();
            abpq[1]=sc.nextInt();
            abpq[2]=sc.nextInt();
            abpq[3]=sc.nextInt();
            so(abpq);
            re[i]=op;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(re[i]);
        }


    }
    static int op=0;
    private static void so(int[] abpq) {
        if(abpq[0]>=abpq[1]) return;
        int a = abpq[0]+abpq[2]+abpq[2];
        int b = abpq[0]+abpq[2]*abpq[3];
        if(a>=b){
            abpq[0]+=abpq[2];
            op++;
        }else{
            abpq[2]*=abpq[3];
            op++;
        }
        so(abpq);
    }


}
