import java.util.*;

public class leo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]= Integer.parseInt(s[i]);
        }
        int result= solution(arr);
        System.out.println(result);

    }

    private static int solution(int[] arr) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < arr.length - 1; i++){
            //找能跳的最远的
            maxPosition = Math.max(maxPosition, arr[i] + i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;

    }


}
