import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		int kx = s1.charAt(1)-'0'; 
		int ky = s1.charAt(0)-'A'+1;
		int rx = s2.charAt(1)-'0';
		int ry = s2.charAt(0)-'A'+1;
		
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			if(s.equals("R")) {
				if(ky+1>8) continue;
				if(kx==rx && ky+1 == ry) {
					if(ry+1>8) continue;
					ry++;
					ky++;
				}else {
					ky++;
				}
			}else if(s.equals("L")) {
				if(ky-1<1) continue;
				if(kx==rx && ky-1 == ry) {
					if(ry-1<1) continue;
					ry--;
					ky--;
				}else {
					ky--;
				}
			}else if(s.equals("B")) {
				if(kx-1<1) continue;
				if(ky==ry && kx-1==rx) {
					if(rx-1<1) continue;
					rx--;
					kx--;
				}else {
					kx--;
				}
			}else if(s.equals("T")) {
				if(kx+1>8) continue;
				if(ky==ry && kx+1==rx) {
					if(rx+1>8) continue;
					rx++;
					kx++;
				}else {
					kx++;
				}
			}else if(s.equals("RT")) {
				if(kx+1>8||ky+1>8) continue;
				if(kx+1==rx && ky+1==ry) {
					if(rx+1>8||ry+1>8) continue;
					rx++;ry++;
					kx++;ky++;
				}else {
					kx++;ky++;
				}
			}else if(s.equals("LT")) {
				if(kx+1>8 || ky-1<1)continue;
				if(kx+1==rx && ky-1 == ry) {
					if(rx+1>8||ry-1<1)continue;
					rx++;ry--;
					kx++;ky--;
				}else {
					kx++;ky--;
				}
			}else if(s.equals("RB")) {
				if(kx-1<1||ky+1>8) continue;
				if(kx-1==rx && ky+1==ry) {
					if(rx-1<1||ry+1>8)continue;
					rx--;ry++;
					kx--;ky++;
				}else {
					kx--;ky++;
				}
			}else {
				if(kx-1<1||ky-1<1) continue;
				if(kx-1==rx && ky-1==ry) {
					if(rx-1<1||ry-1<1)continue;
					rx--;ry--;
					kx--;ky--;
				}else {
					kx--;ky--;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append((char)('A'+ky-1)).append(kx).append('\n');
		sb.append((char)('A'+ry-1)).append(rx);
		
		System.out.println(sb);
		
	}
}