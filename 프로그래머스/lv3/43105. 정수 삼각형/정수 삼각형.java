class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        
        int[][] dp = new int[n][n];
        dp[0][0] = triangle[0][0];
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==1){
                    if(j==0){
                dp[i][j] += triangle[1][0] + dp[0][0];
                    }
                    else if(j==1){
                        dp[i][j] += triangle[1][1] + dp[0][0];
                    }
                }
                else{
                    if(j==0){
                       dp[i][j] = triangle[i][j] + dp[i-1][j];
                    }
                    else if(j==i){
                      dp[i][j] = triangle[i][j] + dp[i-1][j-1];
                    }
                    else{
                      dp[i][j] = triangle[i][j]+Math.max(dp[i-1][j-1] ,dp[i-1][j]);   
                    }
                }
                
            }            
        }
        int answer = 0;
        if(n==1){
            answer = dp[0][0];
        }
        if(n>1){   
        for(int i=0;i<n;i++){
            answer = Math.max(answer,dp[n-1][i]);
        }
        }
        return answer;
    }
}