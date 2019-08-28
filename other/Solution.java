import java.util.Scanner;

class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr1 = new int[l];
        int[] arr2 = new int[l];
        for (int i = 0; i < l; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            arr2[i] = sc.nextInt();
        }
        int num = 0;
        int flag;
        int first = 0;
        int[] arr3 = new int[l];
        for (int i = first ; i < l; i++) {
            flag = arr1[i];
            for (int j = first; j < l; j++) {
                if (arr2[j] == flag){
                    num++;
                    first= j;
                    arr3[i] = arr2[j];
                    break;
                } else {
                    continue;
                }
            }
        }
        System.out.print(l - num);
    }
}