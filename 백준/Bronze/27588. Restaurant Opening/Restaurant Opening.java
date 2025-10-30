import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	int[][] map = new int[n][m];
    	
    	for(int i=0;i<n;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0;j<m;j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	int min = Integer.MAX_VALUE;
    	
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			int cost = 0;
    			for(int k=0;k<n;k++) {
    				for(int l=0;l<m;l++) {
    					cost += (Math.abs(i-k)+Math.abs(j-l))*map[k][l];
    				}
    			}
    			min = Math.min(min, cost);
    		}
    	}
    	
    	System.out.println(min);
    }
}
