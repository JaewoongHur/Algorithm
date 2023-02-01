import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
		for(int i=0; i<T;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int [k+1][n+1];
			for(int j=0; j<n+1; j++) {
				arr[0][j] = j;
			}
			
			for(int a=0;a<k;a++) {
				for(int b=0; b<n; b++) {
					arr[a+1][b+1] = arr[a][b+1]+arr[a+1][b]; 
				}
			}
			System.out.println(arr[k][n]);
		}
		sc.close();
	}
}
