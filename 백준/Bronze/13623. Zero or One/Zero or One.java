import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[3];

		StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt0 = 0;
		int cnt1 = 0;

		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] == 0) {
				cnt0++;
			} else if (arr[i] == 1) {
				cnt1++;
			}
		}

		int winnerIdx = -1;

		if (cnt0 == 1) {
			for (int i = 0; i < 3; i++) {
				if (arr[i] == 0) {
					winnerIdx = i;
				}
			}
		}

		if (cnt1 == 1) {
			for (int i = 0; i < 3; i++) {
				if (arr[i] == 1) {
					winnerIdx = i;
				}
			}
		}

		switch (winnerIdx) {
		case 0:
			System.out.println("A");
			break;

		case 1:
			System.out.println("B");
			break;
		case 2:
			System.out.println("C");
			break;
		default: 
			System.out.println("*");
			break;
		}
		
	}
}