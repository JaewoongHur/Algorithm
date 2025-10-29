import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<n;i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		int m = Integer.parseInt(st.nextToken());
    		
    		int[][] arr = new int[m][2];
    		
    		for(int j=0;j<m;j++) {
    			arr[j][0] = Integer.parseInt(st.nextToken());
    			arr[j][1] = Integer.parseInt(st.nextToken());    			
    		}
    		
    		boolean pass = true;
    		
    		for(int j=0;j<m;j++) {
    			for(int k=j+1;k<m;k++) {
    				if(arr[j][0] == arr[k][0] || arr[j][1] == arr[k][1]) {
    					pass = false;
    					break;
    				}
    			}
    		}
    		
    		System.out.println(pass ? "SAFE" : "NOT SAFE");
    		
    	}
    }
}
