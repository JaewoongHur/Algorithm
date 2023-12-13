class Solution {
    static String[] c = {"A", "E", "I", "O", "U"};
    static int answer;
    static boolean found;

    public int solution(String word) {
        answer = 0;
        found = false;
        dfs("", 0, word);  
        return answer;
    }
    
    static void dfs(String s, int len, String word){        
        if(s.equals(word)){
            found = true;
            return;
        }
        
          if (found || len == 5) {
            return;
        }
        
        for (int i = 0; i < 5; i++) {
                if(found) continue;
                dfs(s + c[i], len + 1, word);
                answer++;
        }
    }
}
