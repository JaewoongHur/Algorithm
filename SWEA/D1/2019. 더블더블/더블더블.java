import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int a = 1;
		sb.append(a).append(' ');
		for(int i=0;i<n;i++) {
			a *=2;
			sb.append(a).append(' ');
		}
		System.out.println(sb);
	}
}