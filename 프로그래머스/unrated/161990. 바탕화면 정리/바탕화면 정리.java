class Solution {
    public int[] solution(String[] wallpaper) {
        int n = wallpaper.length;
        int m = wallpaper[0].length();
        
        char[][] file = new char[n][m];
        
        int minR = n; int maxR = 0; int minC = m; int maxC=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                file[i][j] = wallpaper[i].charAt(j);    
                if(file[i][j]=='#'){
                    minR = Math.min(minR,i);
                    maxR = Math.max(maxR,i+1);
                    minC = Math.min(minC,j);
                    maxC = Math.max(maxC,j+1);                }
            }           
        }
        
        int[] answer = {minR,minC,maxR,maxC};
        return answer;
    }
}