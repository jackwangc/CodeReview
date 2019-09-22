pac
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solveEquation(s));

    }
    public static String solveEquation(String S) {
        int left=0,right=0,j=0,sign=1;
        for(int i=1;i<=S.length();i++){
            if(i==S.length()||S.charAt(i)=='-'||S.charAt(i)=='+'||S.charAt(i)=='='){
                if(S.charAt(i-1)=='x'){
                    if(j==i-1||(S.charAt(j)=='+'&&j==i-2))left+=1*sign;
                    else if(S.charAt(j)=='-'&&j==i-2)left+=-1*sign;
                    else left+=(Integer.valueOf(S.substring(j,i-1)))*sign;
                }
                else
                    right+=(Integer.valueOf(S.substring(j,i)))*(-sign);
                if(i!=S.length()&&S.charAt(i)=='='){
                    j=++i;
                    sign=-sign;
                }
                else
                    j=i;
            }
        }
        if(left==0) return left==right?"Infinite results":"No result";
        return "x="+(right/left);
    }
} 