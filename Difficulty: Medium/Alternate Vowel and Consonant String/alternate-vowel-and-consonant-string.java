import java.util.*;

class Solution {
    private boolean isVowel(int i){
        return i==0 || i==4 || i==8 || i==14 || i==20;
    }

    private String vowelFirst(int[] freq, int n, boolean vowel){
        int i=0, j=0;
        StringBuilder ans=new StringBuilder();
        for(int k=0;k<n;k++){
            if(k%2 != (vowel?1:0)){ // vowel insert
                while(i<26 && (freq[i]==0 || !isVowel(i))) i++;
                ans.append((char)(i+'a'));
                freq[i]--;
            } else { // consonant insert
                while(j<26 && (freq[j]==0 || isVowel(j))) j++;
                ans.append((char)(j+'a'));
                freq[j]--;
            }
        }
        return ans.toString();
    }

    public String rearrange(String S, int N){
        int[] freq = new int[26];
        int cnt_vowel=0, cnt_consonant=0;
        
        for(char c : S.toCharArray()){
            int idx = c - 'a';
            freq[idx]++;
            if(isVowel(idx)) cnt_vowel++;
            else cnt_consonant++;
        }
        
        if(cnt_vowel==cnt_consonant){
            int nonZero=-1;
            for(int i=0;i<26;i++){
                if(freq[i]!=0){
                    nonZero=i;
                    break;
                }
            }
            if(isVowel(nonZero)) return vowelFirst(freq, N, true);
            else return vowelFirst(freq, N, false);
        } else if(cnt_vowel==cnt_consonant+1){
            return vowelFirst(freq, N, true);
        } else if(cnt_vowel+1==cnt_consonant){
            return vowelFirst(freq, N, false);
        } else {
            return "-1";
        }
    }
}
