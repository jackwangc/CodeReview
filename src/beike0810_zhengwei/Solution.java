import java.util.LinkedHashMap;
import java.util.Map;

public class Solution extends LinkedHashMap<Integer,Integer> {
    private int cap;
    public Solution(int capacity) {
        super(capacity,0.75F,true);
        this.cap = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size()>cap;
    }
}