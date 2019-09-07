import java.util.*;

public class  huaweiTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int[] input = new int[str.length];
        for(int i=0;i<str.length;i++){
            input[i]= Integer.parseInt(str[i]);
        }
        int l = MinStep(input);
        System.out.println(l);
    }

    private static int MinStep(int[] input) {
        int l = 0;
        int end = 0;
        int maxnum = 0;
        for(int i = 0; i < input.length - 1; i++){
            maxnum = Math.max(maxnum, input[i] + i);
            if( i == end){
                end = maxnum;
                l++;
            }
        }
        return l;
    }
}
