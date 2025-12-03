import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] pay = new int[n];
		
		String[][] player = new String[n][2];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			pay[i] = Integer.parseInt(st.nextToken());
			
			player[i][0] = st.nextToken();
			player[i][1] = st.nextToken();
		}
		
		int max = 0;
		int idx = 0;
		
		for(int i=0;i<n;i++) {
			if(player[i][1].equals("Russia")) {
				if(pay[i] > max) {
					max = pay[i];
					idx = i;
				}
			}
		}
		System.out.println(player[idx][0]);
	}
}
