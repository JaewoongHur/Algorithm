import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String arr[] = new String[T];
		for(int i=0; i<T; i++) {
			 arr[i] = sc.next();
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j=0; j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') {				
					cnt++;
					sum += cnt;
				}		
				else  cnt=0;
				
				}
			System.out.println(sum);
				
	}
	}
}