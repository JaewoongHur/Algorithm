import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1; i<=T;i++) {
			int N = sc.nextInt();
			int[][] arr90 = new int[N][N];
			int[][] arr180 = new int[N][N];
			int[][] arr270 = new int[N][N];
			// 90도 회전 배열
			for(int r90=0; r90<N;r90++) {
				for(int c90=0; c90<N; c90++) {
					arr90[c90][N-r90-1] = sc.nextInt();
				}
			}
			
			// 180도 회전 배열
			for(int r180=0; r180<N; r180++) {
				for(int c180=0; c180<N; c180++) {
					arr180[c180][N-r180-1] = arr90[r180][c180]; 
				}
			}
			
			// 270도 회전 배열
			for(int r270=0; r270<N; r270++) {
				for(int c270=0; c270<N; c270++) {
					arr270[c270][N-r270-1] = arr180[r270][c270]; 
				}
			}
			// output arr
			System.out.println("#"+ i);
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					System.out.print(arr90[r][c]);
				}
					System.out.print(" ");
					for(int c=0; c<N; c++) {
						System.out.print(arr180[r][c]);
					}
					System.out.print(" ");
					for(int c=0; c<N; c++) {
						System.out.print(arr270[r][c]);
					}
					System.out.println();
				}
				
			}
			
			sc.close();
		}
		
	}