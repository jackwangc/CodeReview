import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class forth{
    //aaa
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()==0){
            System.out.print("-1");
            return;
        }
        char[] chars = s.toCharArray();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0;i<chars.length;i++){
            if(chars[i]>='0' && chars[i]<='9'){
                res.add(chars[i]-'0');
            }
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
}