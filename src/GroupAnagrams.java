import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str: strs){
            char[] chars =str.toCharArray();
            Arrays.sort(chars);
            anagrams.computeIfAbsent(String.valueOf(chars), k -> new ArrayList<>()).add(str);
        }
        return  new ArrayList<>(anagrams.values());
    }
}
