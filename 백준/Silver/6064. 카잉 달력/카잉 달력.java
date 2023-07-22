import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=n;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(N==1 && x!=1) {
				System.out.println(-1);
				continue;
			}
			if(M==1 && y!=1) {
				System.out.println(-1);
				continue;
			}
			if(N==1&&M==1) {
				if(x==1 && y ==1) {
					System.out.println(1);
				}
				else {
					System.out.println(-1);
				}
				continue;
			}
			if(N==1) {
				System.out.println(y);
				continue;
			}
			if(M==1) {
				System.out.println(x);
				continue;
			}
			
			
			boolean success = false;
			
			int a = 0;
			int k = 0;
			while(a<=40000) {
				k = (a * M + y) % N; 
				if(k==x%N) {
					success = true;
					break;
				}
				a++;
			}
			if(success) {
				System.out.println(a*M+y);
			}
			else {
				System.out.println(-1);
			}
			
		}

	}
	
}