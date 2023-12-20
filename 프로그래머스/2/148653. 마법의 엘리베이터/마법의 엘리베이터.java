class Solution {
    public int solution(int storey) {        
        return dfs(storey, 0);
    }

    private int dfs(int storey, int n) {
        if (storey == 0) {
            return n; 
        }

        int d = storey % 10;

        if (d < 5) {
            return dfs(storey / 10, n + d); 
        } else if (d > 5) {
            return dfs(storey / 10 + 1, n + (10 - d)); 
        } else {
            int a = dfs(storey / 10, n + 5); 
            int b = dfs(storey / 10 + 1, n + 5); 
            return Math.min(a, b);
        }
    }
}
