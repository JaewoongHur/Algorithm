import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N, Start, Link, min;
	static int[][] A;
	static int[] B, F;
	static boolean[] D;
	static List<Integer> list;
	static int K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		K = N / 2 - 1;
		A = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		B = new int[K + 1];
		D = new boolean[N];
		F = new int[K + 1];
		D[0] = true;
		min = Integer.MAX_VALUE;
		startTeamBuilding(1, 0);
		System.out.println(min);
	}

	public static void startTeamBuilding(int s, int d) {
		if (d == K) {
			int[] C = new int[2];
			int[] E = new int[2];
			Start = 0;
			Link = 0;
			linkTeamBuilding();
			backTracking(0, 0, C, E);
			min = Math.min(min, Math.abs(Start - Link));
			return;
		}

		for (int i = s; i < N; i++) {
			B[d + 1] = i;
			D[i] = true;
			startTeamBuilding(i + 1, d + 1);
			D[i] = false;
		}
	}

	public static void linkTeamBuilding() {
		int j = 0 ;
		for (int i = 0; i < N; i++) {
			if (!D[i]) {
				F[j] = i;
				j++;
			}			
		}
	}

	public static void backTracking(int s, int d, int[] C, int[] E) {
		if (d == 2) {
			Start += A[C[0]][C[1]] + A[C[1]][C[0]];
			Link += A[E[0]][E[1]] + A[E[1]][E[0]];
			return;
		}
		for (int i = s; i < K + 1; i++) {
			C[d] = B[i];
			E[d] = F[i];
			backTracking(i + 1, d + 1, C, E);
		}
	}
}