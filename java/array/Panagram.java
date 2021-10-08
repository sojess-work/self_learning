//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch = 'a';ch<='z';ch++){
            
            //indexOf funtion returns a negative value if given parameter is not found
            if (sentence.indexOf(ch)<0){
                return false;
            }
        }
       return true; 
    }
}
