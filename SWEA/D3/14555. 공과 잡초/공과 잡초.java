import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1;tc<=T;tc++) {
			String s = br.readLine();
			int N = s.length();
			int cnt =0;
			for(int i = 0;i<N-1;i++) {
				char c = s.charAt(i);
				char c2 = s.charAt(i+1);
				if(c == '(' && (c2 ==')'|| c2=='|')){
					cnt++;
				}
				else if(c=='|' && c2==')') {
					cnt++;
				}
			}
			sb.append("#").append(tc).append(' ');
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}