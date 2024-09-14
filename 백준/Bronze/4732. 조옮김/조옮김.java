import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;

		HashMap<String, Integer> map = new HashMap<>();
		String[] arr = new String[12];

		arr[0] = "A";
		arr[1] = "A#";
		arr[2] = "B";
		arr[3] = "C";
		arr[4] = "C#";
		arr[5] = "D";
		arr[6] = "D#";
		arr[7] = "E";
		arr[8] = "F";
		arr[9] = "F#";
		arr[10] = "G";
		arr[11] = "G#";

		for (int i = 0; i < 12; i++) {
			map.put(arr[i], i);
		}
		
		map.put("B#", 3);
		map.put("E#", 8);
		
		map.put("Ab", 11);
		map.put("Bb", 1);
		map.put("Cb", 2);
		map.put("Db", 4);
		map.put("Eb", 6);
		map.put("Fb", 7);
		map.put("Gb", 9);
		

		while (true) {
			s = br.readLine();

			if (s.equals("***")) {
				break;
			}

			st = new StringTokenizer(s);

			int m = st.countTokens();

			s = br.readLine();

			int n = Integer.parseInt(s);

			for (int i = 0; i < m; i++) {
				String a = st.nextToken();

				int b = map.get(a) + n;

				if (b < 0) {
					b += 12;
				}

				b %= 12;

				System.out.print(arr[b] + " ");
			}
			System.out.println();
		}
	}
}