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
// 第一题 1
class Solution {
    public String solveEquation(String S) {
         int left=0,right=0,j=0,sign=1;
         for(int i=1;i<=S.length();i++){
           if(i==S.length()||S.charAt(i)=='-'||S.charAt(i)=='+'||S.charAt(i)=='='){
             if(S.charAt(i-1)=='x'){
              if(j==i-1||(S.charAt(j)=='+'&&j==i-2))left+=1*sign;
              else if(S.charAt(j)=='-'&&j==i-2)left+=-1*sign;
              else left+=(Integer.valueOf(S.substring(j,i-1)))*sign; 
             }
             else
               right+=(Integer.valueOf(S.substring(j,i)))*(-sign);
             if(i!=S.length()&&S.charAt(i)=='='){
                j=++i;
                sign=-sign;
             } 
             else
               j=i;
           }
         }
        if(left==0) return left==right?"Infinite solutions":"No solution";
        return "x="+(right/left);
    }
} 
