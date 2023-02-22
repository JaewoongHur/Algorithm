import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[500001];
		cnt = 0;
		MenOfPassion(A, n);
		System.out.println(cnt);
		System.out.println(0);		
	}
	public static int MenOfPassion(int[] A, int n) {
		 int i = n/2;
		 cnt++;
		 return A[i];
	}
}