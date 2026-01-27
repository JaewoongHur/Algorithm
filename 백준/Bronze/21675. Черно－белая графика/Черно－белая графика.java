import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		char[][] A = new char[w][h];
		char[][] B = new char[w][h];
		
		for(int i=0;i<w;i++) {
			String s = br.readLine();
			for(int j=0;j<h;j++) {
				A[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0;i<w;i++) {
			String s = br.readLine();
			for(int j=0;j<h;j++) {
				B[i][j] = s.charAt(j);
			}
		}
		
		String f = br.readLine();
		
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				if(A[i][j] == '0' && B[i][j] == '0') {
					System.out.print(f.charAt(0));
				}else if(A[i][j] == '0' && B[i][j] == '1') {
					System.out.print(f.charAt(1));
				}else if(A[i][j] == '1' && B[i][j] == '0') {
					System.out.print(f.charAt(2));
				}else {
					System.out.print(f.charAt(3));
				}
			}
			System.out.println();
		}
		
	}
}
