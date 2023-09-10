import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			String s = sc.next();
			int a = Integer.parseInt(s);
			int b = a % 100;
			switch ((a % 10000) / 100) {
			case 1: {
				if (b >= 1 && b <= 31) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "01/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 2: {
				if (b >= 1 && b <= 28) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "02/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 3: {
				if (b >= 1 && b <= 31) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "03/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 4: {
				if (b >= 1 && b <= 30) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "04/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 5: {
				if (b >= 1 && b <= 31) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "05/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 6: {
				if (b >= 1 && b <= 30) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "06/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 7: {
				if (b >= 1 && b <= 31) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "07/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 8: {
				if (b >= 1 && b <= 31) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "08/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 9: {
				if (b >= 1 && b <= 30) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "09/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 10: {
				if (b >= 1 && b <= 31) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "10/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 11: {
				if (b >= 1 && b <= 30) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "11/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			case 12: {
				if (b >= 1 && b <= 31) {
					System.out.println("#" + i + " " + s.substring(0, 4) + "/" + "12/" + s.substring(6, 8));
				} else {
					System.out.println("#" + i + " -1");
				}
				break;
			}
			default: {
				System.out.println("#" + i + " -1");
			}
			}
		}
		sc.close();
	}
}