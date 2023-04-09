import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, ans;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		ans = Integer.MIN_VALUE;
		
		simulation(0);
		System.out.println(ans);		
	}
	
	private static void simulation (int cnt) {
		if(cnt == 10) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					ans = Math.max(ans, map[i][j]);
				}
			}
			return;
		}
		
		int[][] copy = new int[N][N];
		copy(copy,map);
		
		for(int i=0;i<4;i++) {
			move(i);
			simulation(cnt+1);
			copy(map,copy);			
		}
		
	}
	

	private static void move(int dir) {
		
		switch(dir) {
		
		case 0:
			for(int i=0;i<N;i++) {
				int idx = 0;
				int num = 0;
				for(int j=0;j<N;j++) {
					if(map[j][i] !=0) {
						if(num == map[j][i]) {
							map[idx-1][i] = num * 2;
							num = 0;
							map[j][i] = 0;
						}
						else {
							num = map[j][i];
							map[j][i] = 0;
							map[idx][i] = num;
							idx++;
						}
						
					}
					
				}
				
			}
			
			break;
			
		case 1:
			for(int i=0;i<N;i++) {
				int idx = N-1;
				int num = 0;
				for(int j= N-1; j>=0;j--) {
					if(map[i][j] !=0) {
						if(num == map[i][j]) {
							map[i][idx+1] = num * 2;
							num = 0;
							map[i][j] = 0;
						}
						else {
							num = map[i][j];
							map[i][j] = 0;
							map[i][idx] = num;
							idx--;							
						}
					}
					
				}
				
			}
			
			
			break;
			
		case 2:
			for(int i=0;i<N;i++) {
				int idx = N-1;
				int num = 0;
				for(int j=N-1;j>=0;j--) {
					if(map[j][i] != 0) {
						if(num == map[j][i]) {
							map[idx+1][i] = num * 2;
							map[j][i] = 0;
							num = 0;
						}
						else {
							num = map[j][i];
							map[j][i] = 0;
							map[idx][i] = num;
							idx--;							
						}
						
					}
					
				}
			}
			
			break;
			
		case 3:
			for(int i=0;i<N;i++) {
				int idx = 0; 
				int num = 0;		
				for(int j=0;j<N;j++) {
					if(map[i][j] !=0) {
						if(num == map[i][j]) {
							map[i][idx-1] = num * 2;
							map[i][j] = 0;
							num = 0;
						}
						else {
							num = map[i][j];
							map[i][j] = 0;
							map[i][idx] = num;
							idx++;
						}
					}
					
				}
			}
			
			break;
			
				
		}
		
	}

	private static void copy(int[][] copy,int[][] map) {
		for(int r=0;r<N;r++) {
			for(int c=0;c<N;c++) {
				copy[r][c] = map[r][c];
			}
		}
	}
	
}