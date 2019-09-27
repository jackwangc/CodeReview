//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//
///**
// * Welcome to vivo !
// */
//
//public class leo40 {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String inputStr = br.readLine();
//        int input[] = parseInts(inputStr.split(" "));
//        int output = solution(input);
//        System.out.println(output);
//    }
//
//    private static int[] parseInts(String[] strArr) {
//        if (strArr == null || strArr.length == 0) {
//            return new int[0];
//        }
//        int[] intArr = new int[strArr.length];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = Integer.parseInt(strArr[i]);
//        }
//        return intArr;
//    }
//
//    private  static  int M=100+10;
//    private  static  int[] w = new int[M];
//    private  static  int[] dp = new int[M*100];
//    private  static  boolean[][] state=100+10;
//    private  static  int M=100+10;
//    private static int solution(int[] input) {
//        int sum=0;
//        for(int i=0;i<input.length;i++){
//            sum+=input[i];
//        }
//        int[] arr = new int[100];
//        Arrays.fill(input, input.length);
//        Arrays.fill(input, input.length);
//        for(int j=0;j<input.length;j++){
//            for(int k=1;k<sum/2;k++){
//                input[i][j]
//            }
//        }
//
//        return 1;
//    }
//}