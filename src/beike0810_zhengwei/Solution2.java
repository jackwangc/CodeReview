import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public String getMinVersion(String[] list){
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] a = o1.split(".");
                String[] b = o1.split(".");
                int n = Math.max(a.length,b.length);
                for (int i=0;i<n;i++){
                    int x = i<a.length?Integer.parseInt(a[i]):0;
                    int y = i<b.length?Integer.parseInt(b[i]):0;
                    if (x==y){
                        continue;
                    }

                    if (x>y) return 1;
                    else return -1;
                }
                return 0;
            }
        });
        return list[list.length-1];
    }
}