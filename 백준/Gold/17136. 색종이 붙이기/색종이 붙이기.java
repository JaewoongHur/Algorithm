import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int[] paper = {0,5,5,5,5,5};
	static int min;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		arr = new int[10][10];
		
		for(int i = 0 ;i<10;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		min = Integer.MAX_VALUE;
		
		dfs(0);
		
		if(min == Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
		
		
		
	}

	private static void dfs(int cnt) {
		int sr = -1;
		int sc = -1;
		out:for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(arr[i][j] == 1) {
					sr= i;
					sc= j;
					break out;
				}
			}
		}
		
		if(sr== -1 && sc == -1) {
			min = Math.min(min, cnt);
			return;
		}
		
		int max = 5;
		
		while(max >0) {
			boolean check = true;
			out: for(int i=0;i<max;i++) {
				for(int j=0;j<max;j++) {
					if(sr+i>=10||sc+j>=10||arr[sr+i][sc+j] == 0) {
						check = false;
						break out;
					}
				}	
			}
			if(check) {
				break;
			}
			
			max--;
		}
		for(int k = 1;k<=max;k++) {
		if(paper[k] ==0) {
			continue;
		}
		paper[k]--;
		paste(sr,sc,k,0);
		dfs(cnt+1);
		paste(sr,sc,k,1);
		paper[k]++;
		}
	}

	private static void paste(int sr, int sc, int k,int num) {
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				arr[sr+i][sc+j] = num; 
			}
		}
		
	}
}