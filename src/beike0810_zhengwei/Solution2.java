import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Solution2 {
    public String getMinVersion(String[] list){
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] v1 = o1.split(".");
                String[] v2 = o1.split(".");
                int n = Math.max(v1.length,v2.length);
                for (int i=0;i<n;i++){
                    int v1_int = i<v1.length?Integer.parseInt(v1[i]):0;
                    int v2_int = i<v2.length?Integer.parseInt(v2[i]):0;
                    if (v1_int==v2_int) continue;
                    if (v1_int>v2_int) return 1;
                    else return -1;
                }
                return 0;
            }
        });
        return list[list.length-1];
    }
}