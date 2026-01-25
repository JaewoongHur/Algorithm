import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		char[][] A = new char[5][3*n];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3*n;j++) {
				A[i][j] = '*';
			}
		}
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='A') {
				A[1][3*i+1] = '.';
				A[3][3*i+1] = '.';
				A[4][3*i+1] = '.';
			}else if(s.charAt(i)=='B') {
				A[1][3*i+1] = '.';
				A[3][3*i+1] = '.';
			}else if(s.charAt(i)=='C') {
				A[1][3*i+1] = '.';
				A[2][3*i+1] = '.';
				A[3][3*i+1] = '.';
				A[1][3*i+2] = '.';
				A[2][3*i+2] = '.';
				A[3][3*i+2] = '.';
			}else if(s.charAt(i)=='D') {
				A[1][3*i+1] = '.';
				A[2][3*i+1] = '.';
				A[3][3*i+1] = '.';
			}else if(s.charAt(i)=='E') {
				A[1][3*i+1] = '.';
				A[3][3*i+1] = '.';
				A[1][3*i+2] = '.';
				A[3][3*i+2] = '.';
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3*n;j++) {
				sb.append(A[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
