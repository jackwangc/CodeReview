package zw;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n];
        for (int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.print(maxSubArrayLen(num,k));
    }
    public static int maxSubArrayLen(int[] arr, int k){
        int len = arr.length;
        int cnt = 0, max=0, i, j;

        for(i=0; i<len; i++){
            cnt = 0;

            if(len-i <= max) break;

            for(j=i; j<len; j++){
                cnt += arr[j];
                if(cnt == k && j-i+1 > max) max = j-i+1;
            }
        }

        return max;
    }
}
