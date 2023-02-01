import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int sum = 0;
		for(int i=0; i<S.length(); i++){
			int n = S.charAt(i)-65;
			int m = 0;
			if(n>=0 && n<3) 
				m=3;
			else if(n>=3 && n<6)
				m=4;
			else if(n>=6 && n<9)
				m=5;
			else if(n>=9 && n<12)
				m=6;	
			else if(n>=12 && n<15)
				m=7;
			else if(n>=15 && n<19)
				m=8;		
			else if(n>=19 && n<22)
				m=9;
			else if(n>=22 && n<26)
				m=10;
			else
				m=11;
			
			sum += m;
		}	
		System.out.println(sum);
	}
}
