import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		long r = 0;
		for(int i =0;i<str.length();i++) {
			r = (r*10 + str.charAt(i)-'0')%20000303;
		}
		
		bw.write(String.valueOf(r));
		bw.close();	
	}
}
