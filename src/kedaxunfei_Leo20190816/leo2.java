import java.util.Scanner;

public class leo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int key =sc.nextInt();
        String s = sc.nextLine();
        //int key =sc.nextInt();
        int[] arr = readArr(s);
        int result =getKey(arr, 19,0,arr.length-1);
        int b =(result==-1)?-1:result+1;
        System.out.println(b);
    }

    public static int[] readArr(String s){
        String s2 = s.substring(1,s.length()-1);
        String[] strs = s2.split(",");
        int[] arr = new int[strs.length];
        for(int i =0; i<strs.length; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }
        return arr;
    }

    public static int getKey(int[] arr, int key, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        if (key == arr[mid]) {
            return mid;
        } else if (key > arr[mid]) {
            return getKey(arr, key, mid + 1, high);
        } else {
            return getKey(arr, key, low, mid - 1);
        }

    }
}
