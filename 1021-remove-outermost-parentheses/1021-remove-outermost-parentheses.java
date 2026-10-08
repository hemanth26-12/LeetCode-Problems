class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int ocount =0;
        for(char ch :s.toCharArray()){
            if(ch == '('){
                if(ocount >0){
                    sb.append(ch);
                }
                ocount++;
            }else{

        
            ocount--;
            if(ocount >0){
                sb.append(ch);
            }
        }
    }
    return sb.toString();
}
}