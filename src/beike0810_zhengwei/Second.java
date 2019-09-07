import java.util.Scanner;
public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.substring(1);
        String[] a = s1.split("],");
        String[] b = a[0].split(",");
        int val = Integer.parseInt(a[1]);
        int[] num = new int[b.length];
        for (int i=0;i<b.length;i++){
            num[i] = Integer.valueOf(b[i]);
        }
        sort(num);
        System.out.println(find(num,val));
    }
    public static void sort(int[] arr){
        Qsort(arr,0,arr.length-1);
    }
    public static void Qsort(int[] arr,int low,int high){
        if (low>high){
            return;
        }
        int i=low;
        int j=high;
        int temp = arr[low];
        while (i<j){
            while (arr[j]>=temp && i<j){
                j--;
            }
            while (arr[i]<=temp && i<j){
                i++;
            }
            if (i<j){
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        Qsort(arr,low,i-1);
        Qsort(arr,i+1,high);









    }
    public static int find(int[] num,int val){
        int start = 0;
        int end = num.length-1;
        while (start<=end){
            int mid = (end+start)>>>1;
            if (val==num[mid]){
                return mid;
            }
        }
    }
}
