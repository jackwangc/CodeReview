import java.util.Scanner;
//猿辅导 第二题
public class leo10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  c =Integer.parseInt(sc.nextLine()) ;
        int[] re = new int[c];
        for(int i=0;i<c;i++){
            String[] s2 = sc.nextLine().split(" ");
            int changdu = Integer.parseInt(s2[0]);
            int[] ceshi = new int[changdu];
            for(int k=0;k<changdu;k++){
                ceshi[k]=Integer.parseInt(s2[k+1]);
            }

            re[i]=findNum(ceshi);
        }
        for(int j=0;j<c;j++){
            System.out.println(re[j]);
        }


    }
    public static int findNum(int[] ceshi ){
        int num=0;

        //函数体
        return num;
    }

}
