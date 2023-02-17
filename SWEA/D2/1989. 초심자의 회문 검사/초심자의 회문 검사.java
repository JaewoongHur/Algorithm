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
		for(int i=1;i<=T;i++) {
			String s = br.readLine();
			int len = s.length();
			int c =0;
			for(int j=0;j<len/2;j++) {
				if(s.charAt(j) != s.charAt(len-1-j)) {
					c++;
					break;
				}
			}
			if(c==0) {
				bw.write("#"+i+" "+1+"\n");
			}
			else {
				bw.write("#"+i+" "+0+"\n");
			}			
		}
		br.close();
		bw.close();		
	}
}