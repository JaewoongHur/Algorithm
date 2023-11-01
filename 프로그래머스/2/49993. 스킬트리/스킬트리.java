import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        if(skill.length()==1){
            int answer = 0;
            for(int i=0;i<skill_trees.length;i++){
                for(int j=0;j<skill_trees[i].length();j++){
                    if(skill_trees[i].charAt(j)==(skill.charAt(0))){
                        answer++;
                        break;
                    }
                }
            }
            return skill_trees.length;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<skill.length();i++){
            map.put(skill.charAt(i),i);           
        }
        
        int answer = 0;
        
        for(int i=0;i<skill_trees.length;i++){
            int idx = 0;
            boolean possible = true;
            
            for(int j=0;j<skill_trees[i].length();j++){
                char x = skill_trees[i].charAt(j);
                if(!map.containsKey(x)){
                    continue;
                }
                
                if(map.get(x)>idx){
                    possible = false;
                    break;
                }
                if(map.get(x) == idx){
                   idx++; 
                }
                
            }
           if(possible){
               answer++;
           }
            
        }

        return answer;
    }
}