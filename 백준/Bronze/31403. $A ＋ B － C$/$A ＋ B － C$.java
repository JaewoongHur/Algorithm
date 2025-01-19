import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		String d = a + b;
		
		int ans1 = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
		int ans2 = Integer.parseInt(d) - Integer.parseInt(c);
		
		System.out.println(ans1);
		System.out.println(ans2);
	}
}