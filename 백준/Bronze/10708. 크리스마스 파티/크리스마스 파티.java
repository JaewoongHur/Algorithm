import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int[] target = new int[m];
		
		for(int i=0;i<m;i++) {
			target[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] score = new int[n+1];
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=1;j<=n;j++) {
				int a = Integer.parseInt(st.nextToken());
				
				if( a == target[i]) {
					score[j]++;
				}else {
					score[target[i]]++;
				}
			}
		}
		
		for(int i=1;i<=n;i++) {
			System.out.println(score[i]);
		}
	}
}