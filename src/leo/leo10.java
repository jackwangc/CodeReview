//import java.util.*;
//
//public class leo10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] s=sc.nextLine().split(" ");
//        int[] arr = new int[s.length];
//        for(int i=0;i<s.length;i++){
//            arr[i]= Integer.parseInt(s[i]);
//        }
//        int result= solution(arr);
//        System.out.println(result);
//
//    }
////    private static int solution(int[] arr) {
////        int index=0;
////        int steps=1;
////        int minStep=-1;
////        int tempStep=0;
////        ArrayList<Integer> rs = new ArrayList<Integer>();
////        for(int i=1;i<arr.length/2;i++){
////            index+=i;
////            for(int j=index;j<arr.length;j++){
////                index+=arr[j];
////                j=index;
////                steps++;
////                if(j==arr.length-1) {
////                    tempStep=j;
////                    break;
////                }
////            }
////        }
////
////
////    }
//    private static int solution1(int[] arr) {
//        int end = 0;
//        int maxPosition = 0;
//        int steps = 0;
//        for(int i = 0; i < arr.length - 1; i++){
//            maxPosition = Math.max(maxPosition, arr[i] + i);
//            if( i == end){
//                end = maxPosition;
//                steps++;
//            }
//        }
//        return steps;
//
//    }
//
//
//}
