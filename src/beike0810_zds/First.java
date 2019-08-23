package beike0810_zds;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//zzz
/**
 * Created by lenovo on 2019/8/10.
 */
public class First {
    public static  void main(String []args){
        System.out.print("aaa");
    }

    public  static  void  main(String []args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []array=new int[N];
        HashMap<Integer,Integer> hMap=new HashMap<Integer,Integer>();
        for (int i=0;i<N;i++){
            array[i]=sc.nextInt();
            if(!hMap.containsKey(i)) hMap.put(i,1);
            else {
                int count=hMap.get(i);
                hMap.put(i,count++);
            }
        }
        Arrays.sort(array);
        int mid=array.length/2-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<=mid;i++) {
            int sum = array[i] + array[array.length - i - 1];
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }
        System.out.println(max-min);

    }
}
