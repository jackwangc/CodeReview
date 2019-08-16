import java.util.Scanner;

/**
 * Created by artsing on 2019/8/16.
 */
public class leo2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            int[] arr = readArr(s);
            //execute(arr, target);
        }

        public static int[] readArr(String s){
            String s2 = s.substring(1,s.length()-1);
            String[] strs = s2.split(",");
            int[] arr = new int[strs.length];
            for(int i =0; i<strs.length; i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
            return arr;
        }

}
