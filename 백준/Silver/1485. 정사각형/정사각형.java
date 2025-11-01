import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int tc=0;tc<T;tc++) {
    		
    		double[][] arr = new double[4][2];
    		
    		for(int i=0;i<4;i++) {
    			String[] s = br.readLine().split(" ");
    			arr[i][0] = Double.parseDouble(s[0]);
    			arr[i][1] = Double.parseDouble(s[1]);
    		}
    		
    		
    		if((arr[0][1]-arr[1][1])*(arr[1][0]-arr[2][0]) == (arr[0][0]-arr[1][0])*(arr[1][1]-arr[2][1])) {
    			System.out.println(0);
    			continue;
    		}
    		
    		
    		int mi = 0;
    		double md = 0;
    		
    		for(int i=1;i<4;i++) {
    			double d = (arr[0][0]-arr[i][0])*(arr[0][0]-arr[i][0]) + (arr[0][1]-arr[i][1])*(arr[0][1]-arr[i][1]);
    			if(d > md) {
    				mi = i;
    				md = d;
    			}
    		}
    		
    		int i1 = 0; int i2 = 0;
    		
    		for(int i=1;i<4;i++) {
    			if(i != mi) {
    				i1 = i;
    			}
    		}
    		
    		for(int i=1;i<4;i++) {
    			if(i!=mi && i!=i1) {
    				i2 = i;
    			}
    		}
    		
    		double d1 = Math.pow(arr[0][0]-arr[i1][0], 2) + Math.pow(arr[0][1]-arr[i1][1], 2);
    		double d2 = Math.pow(arr[i1][0]-arr[mi][0],2) + Math.pow(arr[i1][1] - arr[mi][1],2);
    		double d3 = Math.pow(arr[mi][0]-arr[i2][0], 2) + Math.pow(arr[mi][1]-arr[i2][1], 2);
    		double d4 = Math.pow(arr[i2][0]-arr[0][0],2) + Math.pow(arr[i2][1]-arr[0][1], 2);
    		
    		double diag1 = Math.pow(arr[0][0]-arr[mi][0], 2) + Math.pow(arr[0][1]-arr[mi][1], 2);
    		double diag2 = Math.pow(arr[i1][0]-arr[i2][0], 2) + Math.pow(arr[i1][1]-arr[i2][1],2);
    		
    		if(d1 == d2 && d2 == d3 && d3 == d4 && d4 == d1 && diag1 == diag2) {
    			System.out.println(1);
    		}else {
    			System.out.println(0);
    		}
    	}
    }
}
