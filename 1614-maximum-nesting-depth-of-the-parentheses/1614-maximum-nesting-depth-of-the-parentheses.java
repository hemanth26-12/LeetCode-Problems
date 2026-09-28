class Solution {
    public int maxDepth(String s) {
        int maxD = 0;
        int curr=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                curr++;
                maxD = Math.max(maxD,curr);
            }
            else if(c ==')'){
                curr--;
            }
            }
            return maxD;
        
    }
}