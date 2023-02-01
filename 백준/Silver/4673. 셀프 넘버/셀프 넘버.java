
public class Main {
	public static void main(String[] args) {
	
		int[] arr = new int[10001];
		for(int i=1; i<10000;i++) {
			int dn = i + i%10 + (i/10)%10 + (i/100)%10 + (i/1000)%10; 
			if(dn <= 10000)	{
				arr[dn]++;
			}
		}
		
		for(int j=1;j<=10000;j++) {
			if(arr[j] == 0) {
				int selfNumber = j;
				System.out.println(selfNumber);
			}
		}
	}
}
