class Solution {
    public int[] solution(String[] park, String[] routes) {
        char[][] map = new char[park.length][park[0].length()];
        int x = 0;
        int y = 0;
        for(int i=0;i<park.length;i++){
            String s = park[i];
            for(int j=0;j<park[i].length();j++){
                map[i][j] = s.charAt(j);
                if(map[i][j]=='S'){
                    x = i;
                    y = j;
                }
            }        
        }
        
        out: for(int i=0;i<routes.length;i++){
            String[] s = routes[i].split(" ");
            int a = Integer.parseInt(s[1]);
          
            switch(s[0]){
                case "N":
                    if(x-a<0){
                        continue out;
                    }
                     for(int j=1;j<=a;j++){
                       if(map[x-j][y]=='X'){
                           continue out;
                       }
                   } 
                    x-=a;
                    break;
                case "E":
                    if(y+a>park[0].length()-1){
                        continue out;
                    }
                      for(int j=1;j<=a;j++){
                       if(map[x][y+j]=='X'){
                           continue out;
                       }
                   } 
                    y+=a;
                    break;
                case "S":
                    if(x+a>park.length-1){
                        continue out;
                    }
                   for(int j=1;j<=a;j++){
                       if(map[x+j][y]=='X'){
                           continue out;
                       }
                   } 
                    x+=a;
                    break;
                case "W":
                    if(y-a<0){
                        continue out;
                    }
                   for(int j=1;j<=a;j++){
                       if(map[x][y-j]=='X'){
                           continue out;
                       }
                   } 
                   y-=a;                    
                    break;
            }
        }
        
        int[] answer = {x,y};
        return answer;
    }
}