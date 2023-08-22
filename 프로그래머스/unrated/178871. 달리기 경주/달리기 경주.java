import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = players.length;
        int m = callings.length;
        for(int i=0;i<n;i++){
            map.put(players[i],i);
        }
        String k = "";
        int a = 0;
        for(int i=0;i<m;i++){
            k = callings[i];
            a = map.get(k);
            players[a] = players[a-1];
            map.put(players[a-1],a);
            map.put(k,a-1);
            players[a-1] = k;
        }
        return players;
    }
}