class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int dp[] = new int[n];
        java.util.Arrays.fill(dp,Integer.MAX_VALUE);
        int left =0;
        int currentSum =0;
        int minTotalLength= Integer.MAX_VALUE;
        int bestLengthSoFar = Integer.MAX_VALUE;

        for(int right =0;right<n;right++){
            currentSum += arr[right];
            while(currentSum > target){
                currentSum -= arr[left];
                left++;
            }

            if(currentSum == target){
                int currentLen = right - left+1;

                if(left >0 && dp[left -1]!= Integer.MAX_VALUE){
                    minTotalLength = Math.min(minTotalLength,currentLen + dp[left -1]);
                }
                bestLengthSoFar = Math.min(bestLengthSoFar, currentLen);
            }
            if(right>0){
                dp[right] = Math.min(dp[right -1], bestLengthSoFar);
            }
            else{
                dp[right] = bestLengthSoFar;
            }
        
        }
        return minTotalLength == Integer.MAX_VALUE ?-1 : minTotalLength;

    }
}