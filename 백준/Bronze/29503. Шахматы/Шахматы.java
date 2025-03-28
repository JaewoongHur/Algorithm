import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] map = new char[8][8];
		
		for(int i=0;i<8;i++) {
			String s = br.readLine();
			
			for(int j=0;j<8;j++) {
				map[7-i][j] = s.charAt(j); 
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			int a = s.charAt(1)-'0'-1;
			int b = s.charAt(0)-'a';
			int c = s.charAt(3)-'0'-1;
			int d = s.charAt(2)-'a';
			
			if(map[a][b]!='.') {
				char t = map[a][b];
				map[a][b] = '.';
				map[c][d] = t;
				sb.append(t);
			}		
		}
		System.out.println(sb);
	}
}