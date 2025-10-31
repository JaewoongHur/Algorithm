import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String s = br.readLine();
    	
    	char[] arr = s.toCharArray();
    	
    	int[] score = new int[s.length()];
    	
    	score[0] = 1;
    	
    	for(int i=1;i<s.length();i++) {
    		if(arr[i-1] < arr[i]) {
    			score[i] = score[i-1] + 1;
    		}else {
    			score[i] = 1;
    		}
    	}
    	
    	int total = 0;
    	
    	for(int i=0;i<s.length();i++) {
    		total += score[i];
    	}
    	
    	System.out.println(total);
    	
    }
}