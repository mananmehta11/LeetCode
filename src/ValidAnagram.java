/*
* Valid Anagram
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
* An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
* typically using all the original letters exactly once.
* https://leetcode.com/problems/valid-anagram/description/
* */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int counter[] = new int[26];
        int a_ascii = 'a';
        int index = s.length();
        while (--index>=0) counter[s.charAt(index) - a_ascii]++;
        index = t.length();
        while (--index>=0) counter[t.charAt(index) - a_ascii]--;
        index = counter.length;
        while (--index>=0) if (counter[index] != 0) return false;
        return true;
    }
}
