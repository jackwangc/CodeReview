import java.util.Scanner;
public class Leo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int start=0,end=ch.length-1;
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        str = new String(ch);
        System.out.println(str);
    }
}