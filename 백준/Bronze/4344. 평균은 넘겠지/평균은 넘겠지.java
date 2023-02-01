import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for(int i=0; i<C; i++) {
				int N = sc.nextInt();
				int[] arr = new int[N];
				int sum = 0;
			for(int j=0; j<arr.length; j++) {
					arr[j] = sc.nextInt();
					sum += arr[j];
			}		
			double avg = sum/N;
			double cnt = 0;
			for(int j=0; j<arr.length;j++) {
				if(arr[j]>avg) cnt++;
				}
			System.out.printf("%.3f%%\n",cnt/N*100);	
			
		}	
			sc.close();
	}
}
