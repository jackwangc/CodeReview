import java.util.HashMap;
import java.util.Scanner;

public class leo20 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String s =sc.nextLine();
        System.out.println(solution(s,k));
    }


    public static int solution(String s, int k) {

        int re = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right),right);
            while (map.size() > k) {
                char leftChar = s.charAt(l);
                if (map.get(leftChar) == l) {
                    map.remove(leftChar);
                }
                l++;
            }
            int subResult = right - l + 1;
            re = Math.max(re,subResult);
        }
        return re;

    }
}