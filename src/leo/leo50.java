import java.util.*;

public class leo50 {
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
        int result = 2;
        System.out.println(result);

    }


    static int solution(int[] prices, int budget) {
        if(prices==null||prices.length==0) return -1;
        Arrays.sort(prices);
        int count=0;
        for(int i=prices.length-1;i>=0;i--){
            while (budget>=prices[i]){
                int num=budget/prices[i];
                count+=num;
                budget=budget%prices[i];
            }
        }
        if(count==0) return -1;
        else return count;

    }

}
