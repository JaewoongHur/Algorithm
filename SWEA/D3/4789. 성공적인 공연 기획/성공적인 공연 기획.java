import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String s = br.readLine();	// 숫자 받기
			int need = 0;				// 매번 필요한 관객 수
			int sum = 0;				// 관객 누적 합
			int sn = 0;					// 관객 수 누적
			for (int j = 0; j < s.length(); j++) {
				if(j>sum){
					need = j - sum;
					sum += need;
					sn += need;		// 누적 필요한 관객 수
					need = 0;
				}
				sum += s.charAt(j) - '0';	
			}
			bw.write("#" + i + " " + sn);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}