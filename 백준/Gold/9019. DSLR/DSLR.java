import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		boolean[] visit;
		
		int[][] map = new int[10000][4];
		
		for(int i=0;i<10000;i++) {
			map[i][0] = (2 * i) % 10000;
			
			if(i==0) {
				map[i][1] = 9999;
			}
			else {
			map[i][1] = i - 1;
			}
			
			map[i][2] = (i%1000)*10+i/1000;
			
			map[i][3] = (i/10) + (i%10)*1000;
			
		}
		String[] S;
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			visit = new boolean[10000];
			S = new String[10000];
			Queue<Integer> q = new LinkedList<>();
			q.add(A);
			S[A] ="";
			visit[A] = true;
			
			while(!q.isEmpty()) {
				int p = q.poll();
				if(p==B) {
					System.out.println(S[p]);
					break;
				}
				
				for(int d=0;d<4;d++) {
					int a = map[p][d];
					if(visit[a]) {
						continue;
					}
					visit[a] = true;
					if(d==0) {
						q.add(a);
						S[a] = S[p] + "D";
					}
					else if(d==1) {
						q.add(a);
						S[a] = S[p] + "S";
					}
					else if(d==2) {
						q.add(a);
						S[a] = S[p] + "L";
					}
					else {
						q.add(a);
						S[a] = S[p] + "R";
					}
				}

			}
			
		}

	}

}