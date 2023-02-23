import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Character> q = new LinkedList<>();
		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=10;tc++) {
			String s = br.readLine();
			for(int i=0;i<s.length();i++) {
				q.offer(s.charAt(i));
			}
			int result = 0;
			for(int i=1;i<=10;i++) {
				q.clear();
				for(int k=0;k<s.length();k++) {
					q.offer(s.charAt(k));
				}
				StringBuilder sb = new StringBuilder();
				StringBuilder sb2 = new StringBuilder();
				for(int j=0;j<i;j++) {
					sb.append(q.poll());
				}
				for(int j=0;j<i;j++) {
					sb2.append(q.poll());
				}
				if(sb.toString().equals(sb2.toString())) {
					result = i;
					break;
				}
			}
			System.out.println("#"+ tc +" "+ result);			
		}	
	}
}