class Solution {
    public int solution(int number, int n, int m) {
        int a = number % n == 0 && number % m == 0 ? 1: 0;
        return a;
    }
}