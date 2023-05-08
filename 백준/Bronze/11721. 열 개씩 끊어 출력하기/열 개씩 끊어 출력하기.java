import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		String s = br.readLine();
		int N = s.length();
		
		int k = N / 10;
		int m = N % 10;
		
		int idx = 0;
		for(int i=0;i<k;i++) {
			String s2 = s.substring(idx,idx+10);
			idx+= 10;
			System.out.println(s2);
		}
		
		String s2 = s.substring(k*10,k*10+m);
		System.out.println(s2);
		
	}
}