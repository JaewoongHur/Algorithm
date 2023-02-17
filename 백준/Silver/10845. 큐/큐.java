import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		int last = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push")) {
				last = Integer.parseInt(st.nextToken());
				queue.offer(last);
				continue;
			} else if (s.equals("front")) {
				if (queue.isEmpty()) {
					bw.write(String.valueOf(-1));
					bw.newLine();
				} else {
					bw.write(String.valueOf(queue.peek()));
					bw.newLine();
				}
				continue;
			} else if (s.equals("pop")) {
				if (queue.isEmpty()) {
					bw.write(String.valueOf(-1));
					bw.newLine();
				} else {
					bw.write(String.valueOf(queue.poll()));
					bw.newLine();
				}
				continue;
			} else if (s.equals("size")) {
				bw.write(String.valueOf(queue.size()));
				bw.newLine();
				continue;
			} else if (s.equals("empty")) {
				if (queue.isEmpty()) {
					bw.write(String.valueOf(1));
					bw.newLine();
				} else {
					bw.write(String.valueOf(0));
					bw.newLine();

				}
				continue;
			} else {
				if (queue.isEmpty()) {
					bw.write(String.valueOf(-1));
					bw.newLine();
				} else {
					bw.write(String.valueOf(last));
					bw.newLine();
				}
				continue;
			}
		}
		br.close();
		bw.close();
	}
}