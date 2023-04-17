import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int[] h;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		h= new int[N];
		
		for(int i=0;i<N;i++) {
			h[i] = Integer.parseInt(br.readLine());		
		}
		
		int ans = histogram(0,N-1);
		System.out.println(ans);
	}
	private static int histogram(int left, int right) {
		if(left == right) {
			return h[left];
		}
		
		int mid = (left+right)/2;
		
		int leftArea = histogram(left, mid);
		int rightArea = histogram(mid+1,right);
		
		int max = Math.max(leftArea, rightArea);
		
		max = Math.max(max, midArea(left,right,mid));
		
		
		return max;
	}
	
	
	private static int midArea(int left, int right, int mid) {
		
		int height = h[mid];
		int maxArea = h[mid];
		
		int toLeft = mid;
		int toRight = mid;
		
		while(toLeft>left && toRight<right) {
			if(h[toLeft-1] < h[toRight+1]) {
				toRight++;
				height = Math.min(height, h[toRight]);
				
			}
			else {
				toLeft--;
				height = Math.min(height, h[toLeft]);
			}
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
		}
		
		while(toLeft>left) {
			toLeft--;
			height = Math.min(height, h[toLeft]);
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
		}
		
		while(toRight<right) {
			toRight++;
			height = Math.min(height, h[toRight]);
			maxArea = Math.max(maxArea, height * (toRight - toLeft +1));			
		}
		
		
		return maxArea;
	}
	
	
	
}