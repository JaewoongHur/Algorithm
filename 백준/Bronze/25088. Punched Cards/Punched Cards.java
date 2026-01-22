import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			sb.append("Case #").append(tc).append(':').append('\n');
			
			char[][] map = new char[2*r+1][2*c+1];
			
			for(int i=0;i<2*r+1;i++) {
				for(int j=0;j<2*c+1;j++) {
					if(i%2==0) {
						if(j%2==0) {
							map[i][j] = '+';
						}else {
							map[i][j] = '-';
						}
					}else {
						if(j%2==0) {
							map[i][j] = '|';
						}else {
							map[i][j] = '.';
						}
					}
				}
			}
			
			map[0][0] = map[0][1] = map[1][0] = '.';
			
			
			for(int i=0;i<2*r+1;i++) {
				for(int j=0;j<2*c+1;j++) {
					sb.append(map[i][j]);
				}
				sb.append('\n');
			}
		}
		
		System.out.println(sb);
		
	}
}
