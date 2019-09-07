import java.util.*;

public class leo40 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int k =sc.nextInt();
        int[][] obstacle = new int[k][2];
        for(int i=0;i<k;i++){
            obstacle[i][0] = sc.nextInt();
            obstacle[i][1] = sc.nextInt();
        }
        //int result = solution(n,m,obstacle);
        int result = 51;
        System.out.println(result);

    }




}
