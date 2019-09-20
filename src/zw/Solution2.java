package zw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ss = str.split(",");
        if(check(ss))
            System.out.println(true);
        else
            System.out.println(false);
    }

    private static boolean check(String[] ss) {
        int sum =0;
        for (int i = 0; i < ss.length; i++) {
            if(ss[i].contains("-")) {
                int s = checkScope(ss[i]);
                if(s==-1) return false;
                sum+=s;
            } else{
                int s = checkSingle(ss[i]);
                if(s==-1) return false;
                sum+=s;
            }
        }
        return sum<=1024?true:false;
    }

    private static int checkSingle(String s) {
        int port = Integer.parseInt(s);
        if(1<=port && port<=65535)
            return 1;
        else
            return -1;
    }

    private static int checkScope(String s) {
        String[] ss = s.split("-");
        int portS = Integer.parseInt(ss[0]);
        int portE = Integer.parseInt(ss[1]);
        if(1<=portS && portS<=65535 && 1<=portE && portE<=65535 && portS <= portE)
            return portE - portS + 1;
        else
            return -1;
    }

}