package zw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss[] = s.split(",");
        int num = Integer.valueOf(ss[1]);
        System.out.print(ss[0],num);
        System.out.print("11111");
    }
    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
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