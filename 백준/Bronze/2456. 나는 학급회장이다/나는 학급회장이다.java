import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		int[][] voted = new int[4][4];
		
		int[] score = new int[4];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=1;j<=3;j++) {
				int a = Integer.parseInt(st.nextToken());
				voted[j][a]++;				
			}
		}
		
		int max = 0;
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				score[i] += j*voted[i][j];
			}
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		
		if(max == score[1] && max == score[2] && max == score[3]) {
			if(voted[1][3] == voted[2][3] && voted[2][3] == voted[3][3]) {
				if(voted[1][2] == voted[2][2] && voted[2][2] == voted[3][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[1][2] == voted[2][2] && voted[2][2]>voted[3][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[1][2] == voted[3][2] && voted[3][2]>voted[2][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[2][2] == voted[3][2] && voted[3][2]>voted[1][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[1][2] > voted[2][2] && voted[1][2] > voted[3][2]) {
					System.out.println(1 + " " + max);
				}else if(voted[2][2] > voted[1][2] && voted[2][2] > voted[3][2]) {
					System.out.println(2 + " " + max);
				}else if(voted[3][2] > voted[1][2] && voted[3][2] > voted[2][2]) {
					System.out.println(3 + " " + max);
				}
			}else if(voted[1][3] == voted[2][3] && voted[1][3] > voted[3][3]) {
				if(voted[1][2] == voted[2][2]) {
					System.out.println(0 +" " + max);
				}else if(voted[1][2]>voted[2][2]) {
					System.out.println(1 + " " + max);
				}else {
					System.out.println(2 + " " + max);
				}
			}else if(voted[2][3] == voted[3][3] && voted[2][3] > voted[1][3]) {
				if(voted[2][2] == voted[3][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[2][2] > voted[3][2]) {
					System.out.println(2 + " " + max);
				}else {
					System.out.println(3 + " " + max);
				}
			}else if(voted[3][3] == voted[1][3] && voted[3][3] > voted[2][3]) {
				if(voted[3][2] == voted[1][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[3][2] > voted[1][2]) {
					System.out.println(3 + " " + max);
				}else {
					System.out.println(1 + " " + max);
				}
			}else if(voted[1][3] > voted[2][3] && voted[1][3] > voted[3][3]) {
				System.out.println(1 + " " + max);
			}else if(voted[2][3] > voted[3][3] && voted[2][3] > voted[1][3]) {
				System.out.println(2 + " " + max);
			}else if(voted[3][3] > voted[1][3] && voted[3][3] > voted[2][3]) {
				System.out.println(3 + " " + max);
			}
		}else if(max == score[1] && max == score[2]) {
			if(voted[1][3] == voted[2][3]) {
				if(voted[1][2] == voted[2][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[1][2] > voted[2][2]) {
					System.out.println(1 + " " + max);
				}else {
					System.out.println(2 + " " + max);
				}
			}else if(voted[1][3] > voted[2][3]) {
				System.out.println(1 + " " + max);
			}else {
				System.out.println(2 + " " + max);
			}
		}else if(max == score[2] && max == score[3]) {
			if(voted[2][3] == voted[3][3]) {
				if(voted[2][2] == voted[3][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[2][2] > voted[3][2]) {
					System.out.println(2 + " " + max);
				}else {
					System.out.println(3 + " " + max);
				}
			}else if(voted[2][3] > voted[3][3]) {
				System.out.println(2 + " " + max);
			}else {
				System.out.println(3 + " " + max);
			}
		}else if(max == score[3] && max == score[1]) {
			if(voted[3][3] == voted[1][3]) {
				if(voted[3][2] == voted[1][2]) {
					System.out.println(0 + " " + max);
				}else if(voted[3][2] > voted[1][2]) {
					System.out.println(3 + " " + max);
				}else {
					System.out.println(1 + " " + max);
				}
			}else if(voted[3][3] > voted[1][3]) {
				System.out.println(3 + " " + max);
			}else {
				System.out.println(1 + " " + max);
			}
		}else if(max == score[1]) {
			System.out.println(1 + " " + max);
		}else if(max == score[2]) {
			System.out.println(2 + " " + max);
		}else if(max == score[3]) {
			System.out.println(3 + " " + max);
		}
		
	}
}