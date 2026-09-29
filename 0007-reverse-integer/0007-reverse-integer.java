class Solution {
    public int reverse(int x) {

        int revesed = 0;
        while(x!=0){
        int digit = x %10;

        if(revesed > Integer.MAX_VALUE/10  || (revesed == Integer.MAX_VALUE /10 && digit>7)){
            return 0;
        }
        if(revesed <Integer.MIN_VALUE/10 || (revesed == Integer.MIN_VALUE /10 && digit< -8)){
            return 0;
        }
        revesed =revesed*10 + digit;
            x /=10;
        }

        return revesed;

    }
}