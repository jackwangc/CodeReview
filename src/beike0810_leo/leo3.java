import java.util.Scanner;
public class leo3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(",|\\[|\\]");
        int n = strs.length;
        int[] a = new int[n];
        for(int i=1;i<strs.length-1;i++){
            if(strs[i]!=""){
                a[i]=Integer.parseInt(strs[i]);
            }
        }
        System.out.println(solution(a));
    }
    public static int solution(int[] a){
        return a[0];
    }
}