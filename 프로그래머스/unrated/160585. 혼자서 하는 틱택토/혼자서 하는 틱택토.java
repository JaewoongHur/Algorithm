import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] board) {
        char[][] map = new char[3][3]; 
        
        int cntO = 0;
        int cntX = 0;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length();j++){
                map[i][j] = board[i].charAt(j);
                if(map[i][j]=='O'){
                    cntO++;
                }
                else if(map[i][j]=='X'){
                    cntX++;
                }
            }            
        }
        
        boolean ro0 = false;
        boolean ro1 = false;
        boolean ro2 = false;
        boolean co0 = false;
        boolean co1 = false;
        boolean co2 = false;
        boolean do1 = false;
        boolean do2 = false;
        
        boolean rx0 = false;
        boolean rx1 = false;
        boolean rx2 = false;
        boolean cx0 = false;
        boolean cx1 = false;
        boolean cx2 = false;
        boolean dx1 = false;
        boolean dx2 = false;
        
        int cnt = 0;
        
        
        // row
        for(int k=0;k<2;k++){
            for(int i=0;i<3;i++){
                cnt = 0;
                for(int j=0;j<3;j++){
                    if(k==0){
                        if(map[i][j]!='O'){
                            break;
                        }         
                        cnt++;
                        if(cnt==3){
                            if(i==0){
                                ro0=true;
                            }
                            else if(i==1){
                                ro1=true;
                            }
                            else{
                                ro2=true;
                            }
                        }
                    }
                    else{
                        if(map[i][j]!='X'){
                            break;
                        }         
                        cnt++;
                        if(cnt==3){
                            if(i==0){
                                rx0=true;
                            }
                            else if(i==1){
                                rx1=true;
                            }
                            else{
                                rx2=true;
                            }
                        }
                    }
                }
            }
        }
        
        // col
         for(int k=0;k<2;k++){
            for(int i=0;i<3;i++){
                cnt = 0;
                for(int j=0;j<3;j++){
                    if(k==0){
                        if(map[j][i]!='O'){
                            break;
                        }         
                        cnt++;
                        if(cnt==3){
                            if(i==0){
                                co0=true;
                            }
                            else if(i==1){
                                co1=true;
                            }
                            else{
                                co2=true;
                            }
                        }
                    }
                    else{
                        if(map[j][i]!='X'){
                            break;
                        }         
                        cnt++;
                        if(cnt==3){
                            if(i==0){
                                cx0=true;
                            }
                            else if(i==1){
                                cx1=true;
                            }
                            else{
                                cx2=true;
                            }
                        }
                    }
                }
            }
        }
        //diag
        if(map[0][0]=='O'&&map[1][1]=='O'&&map[2][2]=='O'){
            do2=true;
        }
        if(map[0][2]=='O'&&map[1][1]=='O'&&map[2][0]=='O'){
            do1=true;
        }
         if(map[0][0]=='X'&&map[1][1]=='X'&&map[2][2]=='X'){
            dx2=true;
        }
         if(map[0][2]=='X'&&map[1][1]=='X'&&map[0][2]=='X'){
            dx1=true;
        }
        
        int answer = 1;
        
        if(cntX>cntO || cntO>cntX+1){
            return 0;
        }
        
       if((ro1||ro2||ro0||co1||co2||co0||do2||do1) && (rx1||rx2||rx0||cx1||cx2||cx0||dx2||dx1)){
        return 0;     
       }
    
        if(ro1||ro2||ro0||co1||co2||co0||do2||do1){
                if(cntX==cntO){
                    return 0;
                }
            }         
        
        if(rx1||rx2||rx0||cx1||cx2||cx0||dx2||dx1){
            if(cntO>cntX){
                return 0;
            }
        }
        
        
        return answer;
    }
}