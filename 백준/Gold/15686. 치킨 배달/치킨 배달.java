import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<int[]> chicken = new ArrayList<>();

		int min = Integer.MAX_VALUE;

		int[][] arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 2) {
					chicken.add(new int[] { i, j });
				}
			}
		}

	out: for (int k = 1; k < (1 << chicken.size()); k++) {
			char[] c = Integer.toBinaryString(k).toCharArray();
			int cnt=0;
			for(int i=0;i<c.length;i++) {
				if(c[i]=='1') {
					cnt++;
				}
			}
			if(cnt>M) {
				continue out;
			}
			List<int[]> list = new ArrayList<>();
			for (int m = 0; m < chicken.size(); m++) {
				if ((k & (1 << m)) != 0) {
					list.add(chicken.get(m));
				}
			}
			int n = list.size();

			int sum = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j] == 1) {
						int dist =Integer.MAX_VALUE;
						for(int l=0;l<n;l++) {
							int x = list.get(l)[0];
							int y = list.get(l)[1];
							dist = Math.min(dist, Math.abs(x-i)+Math.abs(y-j));
						}
						sum+= dist;
					}
				}				
			}
			min = Math.min(sum, min);			
		}
		System.out.println(min);
	}

}