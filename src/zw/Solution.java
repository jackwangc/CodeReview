package zw;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        int n = Integer.valueOf(ss[0]);
        int m = Integer.valueOf(ss[1]);
        int k = Integer.valueOf(ss[2]);
        if (k==m*n){
            System.out.print(0);
            return;
        }
        int res = Integer.MAX_VALUE;
        int left;
        int i;
        for (i=0;i<n;i++){
            left = n-i;
            int right_max = k/left;
            if (right_max>=m){
                res = Math.min(res,i);
            }else {
                res = Math.min(res,i+(m-right_max));
            }
        }
        System.out.println(Math.min(m,Math.min(n,res)));
    }

}