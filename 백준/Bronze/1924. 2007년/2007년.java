import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);
		
		int z = -1;
		
		switch(x) {
		case 1:
			z+= y;
			break;
		case 2:
			z+=y+31;
			break;	
		case 3:
			z+=y+31+28;
			break;
		case 4:
			z+=y+59+31;
			break;	
		case 5:
			z+= y+90+30;
			break;
		case 6:
			z+= y+120+31;
			break;
		case 7:
			z+= y+151+30;
			break;
		case 8:	
			z+= y+181+31;
			break;
		case 9:
			z+= y+212+31;
			break;
		case 10:
			z+= y+243+30;
			break;
		case 11:
			z+= y+273+31;
			break;
		case 12:
			z+= y+304+30;
			break;
		}
		
		switch(z%7) {
		case 0:
			System.out.println("MON");
			break;
		case 1:
			System.out.println("TUE");
			break;
		case 2:
			System.out.println("WED");
			break;
		case 3:
			System.out.println("THU");
			break;
		case 4:
			System.out.println("FRI");
			break;
		case 5:
			System.out.println("SAT");			
			break;
		case 6:
			System.out.println("SUN");
			break;		
		}
		
	}
}