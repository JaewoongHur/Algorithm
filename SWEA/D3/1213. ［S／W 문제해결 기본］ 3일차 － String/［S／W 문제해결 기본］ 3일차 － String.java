import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i <= 10; i++) {
			int N = Integer.parseInt(br.readLine());
			String s = br.readLine();
			String line = br.readLine();
			int len = s.length();
			int len2 = line.length();
			int cnt = 0;
			for (int j = 0; j <= len2 - len; j++) {
				if (s.equals(line.substring(j, j + len))) {
					cnt++;
				}
			}
			bw.write("#" + N + " " + cnt);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}