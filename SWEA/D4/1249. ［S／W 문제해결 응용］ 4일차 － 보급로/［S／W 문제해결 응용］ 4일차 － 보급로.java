import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;


class Node implements Comparable<Node> { // Comparable 인터페이스를 구현하는 Node 클래스 생성.
	int r, c;
	int weight;

	public Node(int r, int c, int weight) {
		this.r = r;
		this.c = c;
		this.weight = weight;
	}

	@Override // compareTo 메서드를 오버라이드 해줘야함.
	public int compareTo(Node o) {

		return this.weight - o.weight; // 가중치가 낮을 수록 우선 순위로 리턴하도록 설정.
	}

}

public class Solution {
	static int N;
	static int[][] arr;
	static int[][] dist;
	static boolean[][] visited;
	static final int INF = Integer.MAX_VALUE;
	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			visited = new boolean[N][N]; // 방문 여부를 저장할 2차원 배열
			dist = new int[N][N]; // 최신 경로값을 저장할 2차원 배열

			for (int j = 0; j < N; j++) { // arr 입력 받기
				String s = br.readLine();
				for (int k = 0; k < N; k++) {
					arr[j][k] = s.charAt(k) - '0';
					dist[j][k] = INF;	  // dist 배열의 모든 요소 INF로 초기화
				}
			}			
			System.out.println("#"+i+" "+dijkstra());			
		}
	}

	public static boolean boundaryCheck(int r, int c) { // 인덱스값이 2차원 배열 넘어가지 않는 지 확인
		return r >= 0 && r < N && c >= 0 && c < N;
	}

	public static int dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(0, 0, 0)); // 시작점은 0,0 이므로 0,0,0 설정.
		visited[0][0] = true; // 시작점 방문

		// bfs
		while (!pq.isEmpty()) {
			Node n = pq.poll(); // 우선순위 큐에서 우선순위가 높은 요소 반환하면서 삭제.

			for (int i = 0; i < 4; i++) {
				int nr = n.r + dr[i];
				int nc = n.c + dc[i];
				if (!boundaryCheck(nr, nc) || visited[nr][nc]) {
					continue;
				}
				if(dist[nr][nc]> n.weight + arr[nr][nc] ) { // 현재까지의 가중치 합 + 다음 노드 가중치 합 
					dist[nr][nc] = n.weight + arr[nr][nc];  // 최단 배열 저장 값보다 작을 경우 업데이트.
					pq.offer(new Node(nr,nc,dist[nr][nc])); // 갱신된 최단 경로 인접 노드 큐에 추가.
					visited[nr][nc] = true;
				}
			}
		}
		return dist[N-1][N-1];
	}
}