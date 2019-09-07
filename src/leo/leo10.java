import java.util.*;

public class leo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]= Integer.parseInt(s[i]);
        }
        int r = solution(arr);
        System.out.println(r);

    }

    private static int solution(int[] arr) {
        int end = 0;
        int maxPosition = 0;
        int l = 0;
        for(int i = 0; i < arr.length - 1; i++){
            maxPosition = Math.max(maxPosition, arr[i] + i);
            if( i == end){
                end = maxPosition;
                l++;
            }
        }
        return l;

    }


}
