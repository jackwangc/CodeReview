import java.util.*;

public class leo50 {
    public static void main(String[] args) {


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
