import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		String[] num = new String[10];
		
		num[0] = "0000\n0  0\n0  0\n0  0\n0000";
		num[1] = "   1\n   1\n   1\n   1\n   1";
		num[2] = "2222\n   2\n2222\n2\n2222";
		num[3] = "3333\n   3\n3333\n   3\n3333";
		num[4] = "4  4\n4  4\n4444\n   4\n   4";
		num[5] = "5555\n5\n5555\n   5\n5555";
		num[6] = "6666\n6\n6666\n6  6\n6666";
		num[7] = "7777\n   7\n   7\n   7\n   7";
		num[8] = "8888\n8  8\n8888\n8  8\n8888";
		num[9] = "9999\n9  9\n9999\n   9\n   9";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			sb.append(num[s.charAt(i)-'0']).append("\n\n");
		}
		System.out.println(sb);
	}
}