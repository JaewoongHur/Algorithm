import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] map = new int[] {16,22,4,17,19,24,20,8,14,15,0,18,3,5,6,7,9,10,11,25,23,2,21,1,13,12};
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)==' ') {
				sb.append(' ');
			}else {
				sb.append((char)(map[s.charAt(i)-'a']+'a'));
			}
		}
		System.out.println(sb);
	}
}