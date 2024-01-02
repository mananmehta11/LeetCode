import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyByNum = new HashMap<>();
        for(int num: nums)
            frequencyByNum.put(num, frequencyByNum.getOrDefault(num,  0 ) + 1);
        Map<Integer, List<Integer>> numByFrequency = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<Integer, Integer> entry: frequencyByNum.entrySet()) {
            numByFrequency.computeIfAbsent(entry.getValue(), key -> new ArrayList<>()).add(entry.getKey());
        }
        int []topK = new int[k];
        int index=0;
        for(List<Integer> topList: numByFrequency.values()){
            for(Integer top: topList) {
                topK[index] = top;
                index++;
                if (index == k) return topK;
            }
        }
        return new int[]{};
    }
}
