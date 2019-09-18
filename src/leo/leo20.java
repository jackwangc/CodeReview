import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class leo20 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] s = sc.nextLine().split(";");
        if(s.length!=2){
            System.out.println("True");
        }else{
            String re =solution(s[0],s[1])?"True":"False";
            System.out.println(re);
        }

    }


    public static boolean solution(String s1,String s2) {
        int length = s1.length();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Map m = new HashMap();

        for(int i=0; i<length; i++)
        {
            if(m.get(ch1[i]) != null){
                ch1[i] =(char) m.get(ch1[i]);
            }else{
                if(m.containsValue(ch2[i]))return  false;
                m.put(ch1[i],ch2[i]);
                ch1[i] = ch2[i];
            }
            if(ch1[i] != ch2[i])    return false;
        }

        return true;
    }
}