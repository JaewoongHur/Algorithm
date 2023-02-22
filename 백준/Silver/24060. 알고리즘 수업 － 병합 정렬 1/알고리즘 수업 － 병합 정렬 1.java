import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	static int cnt;
	static int K;
	static int num;
	static int[] tmp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		tmp = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		cnt = 0;
		mergeSort(A,0,N-1);
		
		if(cnt<K) {
			System.out.println(-1);
		}
		else {
			System.out.println(num);
		}
	}

	public static void mergeSort(int[] A,int p,int r) {
		int q;
		if(p<r) {
			q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);	
		}	
	}

	public static void merge(int[]A, int p, int q, int r) {
		int i = p; int j = q+1; int t= 0;
		while(i<=q && j<=r) {
			if(A[i]<= A[j]) {
				tmp[t++] = A[i++];
			}
			else {
				tmp[t++] = A[j++];
			}
		}
		while(i<=q) {
			tmp[t++] = A[i++];
			}
		while(j<=r) {
			tmp[t++] = A[j++];			
		}
		i=p; t=0;
		while(i<=r) {
			A[i++] = tmp[t++]; 
			cnt++;
			if(cnt == K) {
				num = A[i-1];
				break;
			}
		}
	}
}