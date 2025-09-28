import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		int n = Integer.parseInt(s[0]);
		int c = Integer.parseInt(s[1]);

		int[][] sema = new int[8][8];
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				Arrays.fill(sema[i], -1);
			}
		}
		
		sema[0][1] = sema[1][0] = 0;
		sema[0][2] = sema[2][0] = 1;
		sema[0][3] = sema[3][0] = 2;
		sema[0][4] = sema[4][0] = 3;
		sema[0][5] = sema[5][0] = 4;
		sema[0][6] = sema[6][0] = 5;
		sema[0][7] = sema[7][0] = 6;
		sema[1][2] = sema[2][1] = 7;
		sema[1][3] = sema[3][1] = 8;
		sema[4][6] = sema[6][4] = 9;
		sema[1][4] = sema[4][1] = 10;
		sema[1][5] = sema[5][1] = 11;
		sema[1][6] = sema[6][1] = 12;
		sema[1][7] = sema[7][1] = 13;
		sema[2][3] = sema[3][2] = 14;
		sema[2][4] = sema[4][2] = 15;
		sema[2][5] = sema[5][2] = 16;
		sema[2][6] = sema[6][2] = 17;
		sema[2][7] = sema[7][2] = 18;
		sema[3][4] = sema[4][3] = 19;
		sema[3][5] = sema[5][3] = 20;
		sema[4][7] = sema[7][4] = 21;
		sema[5][6] = sema[6][5] = 22;
		sema[5][7] = sema[7][5] = 23;
		sema[3][6] = sema[6][3] = 24;
		sema[6][7] = sema[7][6] = 25;
		
		int[] arr = new int[n];

		for (int h = 0; h < n; h++) {
			int x = -1;
			int y = -1;

			for (int i = 0; i < 9; i++) {
				String a = br.readLine();
				for (int j = 0; j < 9; j++) {
					if (i == 5 && j == 4 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 0;
						} else {
							y = 0;
						}
					} else if (i == 5 && j == 3 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 1;
						} else {
							y = 1;
						}
					} else if (i == 4 && j == 3 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 2;
						} else {
							y = 2;
						}
					} else if (i == 3 && j == 3 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 3;
						} else {
							y = 3;
						}
					} else if (i == 3 && j == 4 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 4;
						} else {
							y = 4;
						}
					} else if (i == 3 && j == 5 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 5;
						} else {
							y = 5;
						}
					} else if (i == 4 && j == 5 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 6;
						} else {
							y = 6;
						}
					} else if (i == 5 && j == 5 && a.charAt(j) == '#') {
						if (x == -1) {
							x = 7;
						} else {
							y = 7;
						}
					}
				}
			}
			arr[h] = sema[x][y];
		}

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] + c) % 26;
		}

		char[][][] ans = new char[n][9][9];

		for (int h = 0; h < n; h++) {
			int x = 0;
			int y = 0;
			
			out: for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (arr[h] == sema[i][j]) {
						x = i;
						y = j;
						break out;
					}
				}
			}
			ans[h][4][4] = '*';
			
			if (x == 0) {
				ans[h][5][4] = '#';
				ans[h][6][4] = '#';
				ans[h][7][4] = '#';
			} else if (x == 1) {
				ans[h][5][3] = '#';
				ans[h][6][2] = '#';
				ans[h][7][1] = '#';
			} else if (x == 2) {
				ans[h][4][1] = '#';
				ans[h][4][2] = '#';
				ans[h][4][3] = '#';
			} else if (x == 3) {
				ans[h][1][1] = '#';
				ans[h][2][2] = '#';
				ans[h][3][3] = '#';
			} else if (x == 4) {
				ans[h][1][4] = '#';
				ans[h][2][4] = '#';
				ans[h][3][4] = '#';
			} else if (x == 5) {
				ans[h][1][7] = '#';
				ans[h][2][6] = '#';
				ans[h][3][5] = '#';
			} else if (x == 6) {
				ans[h][4][5] = '#';
				ans[h][4][6] = '#';
				ans[h][4][7] = '#';
			} else if (x == 7) {
				ans[h][5][5] = '#';
				ans[h][6][6] = '#';
				ans[h][7][7] = '#';
			}

			if (y == 0) {
				ans[h][5][4] = '#';
				ans[h][6][4] = '#';
				ans[h][7][4] = '#';
			} else if (y == 1) {
				ans[h][5][3] = '#';
				ans[h][6][2] = '#';
				ans[h][7][1] = '#';
			} else if (y == 2) {
				ans[h][4][1] = '#';
				ans[h][4][2] = '#';
				ans[h][4][3] = '#';
			} else if (y == 3) {
				ans[h][1][1] = '#';
				ans[h][2][2] = '#';
				ans[h][3][3] = '#';
			} else if (y == 4) {
				ans[h][1][4] = '#';
				ans[h][2][4] = '#';
				ans[h][3][4] = '#';
			} else if (y == 5) {
				ans[h][1][7] = '#';
				ans[h][2][6] = '#';
				ans[h][3][5] = '#';
			} else if (y == 6) {
				ans[h][4][5] = '#';
				ans[h][4][6] = '#';
				ans[h][4][7] = '#';
			} else if (y == 7) {
				ans[h][5][5] = '#';
				ans[h][6][6] = '#';
				ans[h][7][7] = '#';
			}

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (ans[h][i][j] != '*' && ans[h][i][j] != '#') {
						ans[h][i][j] = '.';
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int h = 0; h < n; h++) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(ans[h][i][j]);
				}
				sb.append('\n');
			}
		}
		
		System.out.println(sb.toString());
	}
}