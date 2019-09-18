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

    public boolean isIsomorphic(String s, String t) {
        int [][] flag=new int[127][2];//第一维127个格子代表127个字符，
        char[] chars = s.toCharArray();// 第二维，0号元素代表有没有被替换使用，
        char[] chart = t.toCharArray();// 1号元素代表使用哪个元素进行替换
        for (int i = 0; i <chars.length; i++) {
            if (flag[chars[i]-'\0'][1]==chart[i]-'\0')continue;//已经映射成功的
            else if (flag[chart[i]-'\0'][0]==0&&flag[chars[i]-'\0'][1]==0){//暂未映射
                flag[chart[i]-'\0'][0]=1;//标记这个字母已用
                flag[chars[i]-'\0'][1]=chart[i]-'\0';//并且形成映射
            }
            else return false;
        }
        return true;
    }
}