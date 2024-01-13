import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			String s = br.readLine();

			int[] arr = new int[8];

			for (int i = 0; i <= 37; i++) {
				if (s.subSequence(i, i + 3).equals("TTT")) {
					arr[0]++;
				} else if (s.subSequence(i, i + 3).equals("TTH")) {
					arr[1]++;
				} else if (s.subSequence(i, i + 3).equals("THT")) {
					arr[2]++;
				} else if (s.subSequence(i, i + 3).equals("THH")) {
					arr[3]++;
				} else if (s.subSequence(i, i + 3).equals("HTT")) {
					arr[4]++;
				} else if (s.subSequence(i, i + 3).equals("HTH")) {
					arr[5]++;
				} else if (s.subSequence(i, i + 3).equals("HHT")) {
					arr[6]++;
				} else if (s.subSequence(i, i + 3).equals("HHH")) {
					arr[7]++;
				}
			}
			
			for(int i=0;i<8;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}

	}
}