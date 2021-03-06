/*
 M
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed   
from the magazines ;otherwise, it will return false.   

Each letter in the magazine 
string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charMap = new int[26];
        
        for(char mc:magazine.toCharArray()){
            charMap[mc-'a']++;
        }
        
        for(char rc:ransomNote.toCharArray()){
            if(charMap[rc-'a']>0) charMap[rc-'a']--;
            else return false;
        }
        
        return true;
    }
}
