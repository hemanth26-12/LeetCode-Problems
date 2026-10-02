class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(res, "", 0, 0, n);
        return res;

    }
    private void solve(List<String> res, String cur, int open,int close, int n){
        if(cur.length() == n*2){
        res.add(cur);
        return;
    }
    if(open < n) solve(res, cur + "(", open + 1,close, n);
    if(close < open) solve(res, cur + ")",open,close +1,n);
}
}