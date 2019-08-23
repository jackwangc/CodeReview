import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class forth{
    //aaa
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        char[] chars = s.toCharArray();
        ArrayList<Integer> res = new ArrayList<>();
        boolean bool = true;
        for (int i=0;i<chars.length;i++){
            if(chars[i]>='0' && chars[i]<='9'){
                res.add(chars[i]-'0');
                bool = false;
            }
        }
        if (bool){
            System.out.print("-1");
            return;
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
}