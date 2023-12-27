import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int start = 0, end = 0;
        int sum = sequence[0];
        int minLength = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (end < n) {
            if (sum < k) {
                end++;
                if (end < n) {
                    sum += sequence[end];
                }
            } else if (sum > k) {
                sum -= sequence[start];
                start++;
            } else {
                int length = end - start + 1;
                if (length < minLength) {
                    minLength = length;
                    answer[0] = start;
                    answer[1] = end;
                }
                end++;
                if (end < n) {
                    sum += sequence[end];
                }
            }
        }

        return answer;
    }
}
