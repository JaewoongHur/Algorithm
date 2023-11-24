import java.util.*;

class Solution {
    static boolean[][] visitH, visitV;
    static int[][] map;
    
    public int solution(String dirs) {
        int answer = 0;
        
        map = new int[11][11];
        visitH = new boolean[11][10];
        visitV = new boolean[10][11];
        
        int x = 5; int y = 5;
        
        for(int i=0;i<dirs.length();i++){
            char a = dirs.charAt(i);
            
            switch(a){
                case 'U':
                    if(bound(x-1,y)){
                        x--;
                        visitV[x][y] = true;
                    }
                    break;
                    
                case 'D':
                       if(bound(x+1,y)){
                        x++;
                        visitV[x-1][y] = true;
                       }
                    break;
                    
                case 'L':
                       if(bound(x,y-1)){
                        y--;
                        visitH[x][y] = true;
                       }
                    break;
                    
                case 'R':
                    if(bound(x,y+1)){
                        y++;
                        visitH[x][y-1] =true;
                       }
                    break; 
                 }
        }      
        
        for(int i=0;i<11;i++){
            for(int j=0;j<10;j++){
                if(visitH[i][j]){
                    answer++;
                } 
            }
        }
        
        for(int i=0;i<10;i++){
            for(int j=0;j<11;j++){
                if(visitV[i][j]){
                    answer++;
                }
            }
        }

        return answer;
    }
                       
    static boolean bound (int r, int c){
        return r>=0 && r< 11 && c>=0 && c<11;
    }
    
}