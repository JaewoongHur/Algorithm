class Solution {
    public int solution(int a, int b) {
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        
        int c = Integer.parseInt(A+B);
        int d = 2 * a * b;
        
        int answer = Math.max(c,d);
        return answer;
    }
}