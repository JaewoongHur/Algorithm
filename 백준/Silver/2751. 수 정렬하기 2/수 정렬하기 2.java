import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		List<Integer> L = new ArrayList<>();
		
		for(int i =0;i<N;i++) {
			L.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(L);
		for(int x : L) {
			bw.write(x+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}