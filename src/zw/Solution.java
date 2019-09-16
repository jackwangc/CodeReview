package zw;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        int[][] num = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                int temp = sc.nextInt();
                num[i][j] = temp;
            }
        }
        if (m==1){
            for (int i=n-1;i>=0;i--){
                System.out.print(num[0][i]);
                if (i!=0){
                    System.out.print(" ");
                }
            }
            return;
        }
        if (n==1){
            for (int i=0;i<m;i++){
                System.out.print(num[i][0]);
                if (i!=m-1){
                    System.out.print(" ");
                }
            }
            return;
        }
        ArrayList list = printMatrix(num);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if (i!=list.size()-1){
                System.out.print(" ");
            }
        }
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList();
        if (matrix.length==0){
            return null;
        }
        int start = 0;
        while (matrix.length>start*2 && matrix[0].length>start*2){
            printMatrix1(matrix,start,res);
            start++;
        }
        return res;
    }
    public static void printMatrix1(int [][] matrix,int start,ArrayList res){
        int endX = matrix[0].length-start-1;
        int endY = matrix.length-start-1;
        //左面
        for (int i=start;i<=endY;i++){
            res.add(matrix[i][start]);
        }
        //下面
        for (int i=start+1;i<=endX;i++){
            res.add(matrix[endY][i]);
        }
        //右面
        for (int i=endY-1;i>=start;i--){
            res.add(matrix[i][endX]);
        }
        //上面
        for (int i=endX-1;i>=start+1;i--){
            res.add(matrix[start][i]);
        }
    }
}