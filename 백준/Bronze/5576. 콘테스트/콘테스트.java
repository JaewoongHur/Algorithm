import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] w = new int[10];
		int[] k = new int[10];
		
		for (int i = 0; i < 10; i++) {
			w[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<10;i++) {
			k[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(w);
		Arrays.sort(k);
		
		int a = w[7]+w[8]+w[9];
		int b = k[7]+k[8]+k[9];
		
		System.out.println(a + " " + b);
	}
}