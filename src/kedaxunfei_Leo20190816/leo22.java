import java.util.Scanner;

public class leo22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int nt = sc.nextInt();
        int n=1 << nt;
        int[] ns= new int[n];
        for(int i=0;i<n;i++){
            ns[i]=sc.nextInt();
        }
        int m= sc.nextInt();
        int[] ms= new int[m];
        for(int i=0;i<m;i++){
            ms[i]=sc.nextInt();
        }
        solution(n,ns,m,ms);

    }

    private static void solution(int len1, int[] ns, int m, int[] ms) {
        for (int i=0;i<m;i++){
            fanzhuan(ns,1<<ms[i]);
            int[] nsns= new int[len1];
            for(int j=0;j<len1;j++){
                nsns[j]=ns[j];
            }
            System.out.println(nixvdui(nsns));
        }

    }


    private static void fanzhuan(int[] ns, int i) {
        if(i==1) return;
        for(int j=0;j<ns.length/i;j++){
            for(int k=0;k<i/2;k++){
                int temp=ns[k+i*j];
                ns[k+i*j]=ns[i*j+i-k-1];
                ns[i*j+i-k-1] =temp;
            }
        }
    }
    static int[] help;
    static long count   =0;
    private static long nixvdui(int[] nsns) {
        if(nsns==null || nsns.length==0){
            return 0;
        }
        help = new int[nsns.length];
        count   =0;
        mergeSort(nsns,0,nsns.length-1);
        return count ;
    }

    public static void mergeSort(int[] array, int start, int end){
        if(start>=end){
            return ;
        }
        int mid = (start+end)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,mid,end);
    }

    public static void merge(int[] array, int start, int mid, int end){

        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=end){
            if(array[i]>array[j]){
                temp[k] = array[i];
                k++;
                i++;
                count = count + (end-j+1);
            }else {
                temp[k] = array[j];
                k++;
                j++;
            }
        }
        while (i<=mid){
            temp[k] = array[i];
            k++;
            i++;
        }
        while (j<=end){
            temp[k] = array[j];
            k++;
            j++;
        }
        for (i = start,k = 0; i <=end && k<temp.length; i++,k++) {
            array[i] = temp[k];
        }
    }

}

