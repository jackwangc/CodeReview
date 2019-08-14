import java.util.HashMap;
import java.util.Scanner;
public class leo3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(",|，|\\[|\\]");
        int n = strs.length;
        int[] a = new int[n];
        for(int i=1;i<strs.length;i++){
            if(strs[i]!=""){
                a[i-1-1]=Integer.parseInt(strs[i]);
            }
        }
        System.out.println(solution(a));
    }
    public static int solution(int[] a){
        HashMap<Integer, Integer> hm = new HashMap<>();
        if(a.length == 0) return 0;
        int max = 1;
        for(int n: a){
            if(!hm.containsKey(n)){
                if(hm.containsKey(n+1)){
                    hm.put(n, hm.get(n + 1));
                    hm.put(hm.get(n + 1), n);
                    max = Math.max(max, (hm.get(n) - n) + 1);
                    if(hm.containsKey(n-1)){
                        hm.put(hm.get(n), hm.get(n - 1));
                        int left_index = hm.get(n - 1);
                        hm.put(hm.get(n - 1), hm.get(n));
                        max = Math.max(max, (hm.get(left_index) - hm.get(hm.get(n))) + 1);
                    }
                }else if(hm.containsKey(n-1)){
                    hm.put(n, hm.get(n - 1));
                    hm.put(hm.get(n - 1), n);
                    max = Math.max(max, (n - hm.get(n)) + 1);
                }else{
                    hm.put(n, n);
                }
            }
        }
        return max;
    }
}