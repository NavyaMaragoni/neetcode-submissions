class Solution {
    public boolean isAnagram(String s, String t) {

        int string1[]=new int[26];
        int string2[]=new int[26];

        for(char ch:s.toCharArray()){
            string1[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            string2[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(string1[i]!=string2[i]){
                return false;
            }
        }

        return true;


    }
}
