import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int min = Integer.MAX_VALUE;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] stop = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			stop[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(stop);
		
		int[] dist = new int[n-1];
		
		for(int i=0;i<n-1;i++) {
			dist[i] = stop[i+1] - stop[i];
			
			if(dist[i] < min) {
				min = dist[i];
			}
		}
		
		int num = 0;
		
		for(int i=0;i<n-1;i++) {
			if(min == dist[i]) {
				num++;
			}
		}
		
		System.out.println(min + " " + num);
		
	}
}