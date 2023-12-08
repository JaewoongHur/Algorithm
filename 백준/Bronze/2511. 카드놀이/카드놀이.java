import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] A = new int[10];
		int[] B = new int[10];

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 10; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 10; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		String last = "D";

		int scoreA = 0;
		int scoreB = 0;

		for (int i = 0; i < 10; i++) {
			if (A[i] > B[i]) {
				last = "A";
				scoreA += 3;
			} else if (B[i] > A[i]) {
				last = "B";
				scoreB += 3;
			} else {
				scoreA += 1;
				scoreB += 1;
			}
		}

		System.out.println(scoreA + " " + scoreB);

		if (scoreA > scoreB) {
			System.out.println("A");
		} else if(scoreB > scoreA) {
			System.out.println("B");
		}else {
			System.out.println(last);
		}
		
	}
}