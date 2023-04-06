import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		sb.append(s.charAt(2)).append(s.charAt(1)).append(s.charAt(0));
		System.out.println(sb.toString());
	}
}