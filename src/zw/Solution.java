package zw;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        long n = Long.valueOf(ss[0]);
        long m = Long.valueOf(ss[1]);
        long k = Long.valueOf(ss[2]);
        if (k==m*n){
            System.out.print(0);
            return;
        }
        long res = Integer.MAX_VALUE;
        long left;
        long i;
        long pre = Integer.MAX_VALUE;
        for (i=0;i<n;i++){
            left = n-i;
            long right_max = k/left;
            if (right_max>=m){
                res = Math.min(res,i);
            }else {
                res = Math.min(res,i+(m-right_max));
            }
            if ((i+right_max)>pre){
                break;
            }
        }
        System.out.println(Math.min(m,Math.min(n,res)));
    }

}