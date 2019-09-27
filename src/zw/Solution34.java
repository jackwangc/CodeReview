//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String sn = sc.nextLine();
//        int n = Integer.valueOf(sn);
//        String[] str = new String[n];
//        for (int i=0;i<n;i++){
//            String s = sc.nextLine();
//            str[i] = s;
//        }
//        Arrays.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return String.valueOf(o1.charAt(0)).compareTo(String.valueOf(o2.charAt(0)));
//            }
//        });
//        for (int i=0;i<n;i++){
//            System.out.println(str[i]);
//        }
//    }
//}
