import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			int x = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
			if(a == 0) {
				cnt++;
			}
			
			if(b == x) {
				cnt++;
			}
			
			System.out.println(2 - cnt);
			
		}else if(n == 2) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
			if(x1 == 0) {
				cnt++;
			}
			
			if(y1 == 0) {
				cnt++;
			}
			
			if(x2 == x) {
				cnt++;
			}
			
			if(y2 == y) {
				cnt++;
			}
			
			System.out.println(4 - cnt);
		}else {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int z1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int z2 = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
			if(x1 == 0) {
				cnt++;
			}
			
			if(y1 == 0) {
				cnt++;
			}
			
			if(z1 == 0) {
				cnt++;
			}
			
			if(x2 == x) {
				cnt++;
			}
			
			if(y2 == y) {
				cnt++;
			}
			
			if(z2 == z) {
				cnt++;
			}
			
			System.out.println(6 - cnt);
		}
		
	}
}
