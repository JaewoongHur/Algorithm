import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] h;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String s;

		while (!(s = br.readLine()).equals("0")) {

			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());

			h = new int[n];

			for (int i = 0; i < n; i++) {
				h[i] = Integer.parseInt(st.nextToken());
			}
			sb.append(histogram(0,n-1)).append('\n');
		}
		System.out.println(sb);
	}

	private static long histogram(int left, int right) {
		if (left == right) {
			return h[left];
		}

		int mid = (left + right) / 2;

		long leftArea = histogram(left, mid);
		long rightArea = histogram(mid + 1, right);

		long max = Math.max(leftArea, rightArea);
		
		max = Math.max(max, MidArea(left,right,mid));
		
		return max;
	}
	
	private static long MidArea(int left, int right, int mid) {
		int toLeft = mid;
		int toRight = mid;
		
		long height = h[mid];
		
		long maxArea = height;
		
		while(left<toLeft && toRight<right) {
			if(h[toLeft-1] <h[toRight+1]) {
				toRight++;
				height = Math.min(height, h[toRight]);				
			}
			else {
				toLeft--;
				height = Math.min(height, h[toLeft]);
			}
			
			maxArea = Math.max(maxArea,  height * (toRight - toLeft + 1));
		}
		
		while(toRight < right) {
			toRight++;
			height = Math.min(height, h[toRight]);
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
			
		}
		
		while(left<toLeft) {
			toLeft--;
			height = Math.min(height, h[toLeft]);
			maxArea = Math.max(maxArea, height *(toRight - toLeft + 1));
		}
		return maxArea;
		
	}

}