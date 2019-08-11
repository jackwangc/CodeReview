import java.util.Scanner;

/**
 给定两个正整数N和S，你需要找对所有的长度为N的正整数数列中，满足单调递增以及总和为S的数列有多少个
 */
public class leo1 {
    private static int num =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int s =sc.nextInt();
        System.out.println(findNum(n,s));
    }
    public static int   findNum(int n,int s){
        if (check(n,s)&&n==2) num++;
        if (check(n,s)){
            for(int i=1;i<s/2;i++){
                findNum(n-1,s-i);
            }
        }
        return num;
    }

    //判断是否存在长度为N，总和为S的单调递增正整数序列
    public  static  boolean check(int n,int s){
        boolean result= true;
        int min=0;
        for(int i=1;i<=n;i++){
            min=min+i;
        }
        if(s<min){
            result=false;
        }
        return  result;
    }
}
