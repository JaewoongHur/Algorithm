import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	static int[] month = new int[]{31,31,28,31,30,31,30,31,31,30,31,30};
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int z1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int z2 = Integer.parseInt(st.nextToken());

        
        if(x2-x1>1000) {
        	System.out.println("gg");
        }
        else if(x2-x1==1000) {
        	if(y2>y1){
        		System.out.println("gg");
        	}
        	else if(y2==y1 && z2>=z1) {
        		System.out.println("gg");
        	}
        	else {
        		  int a = month[y1 % 12]-z1;
        	        if(isLeapYear(x1) && y1 == 2) {
        	        	a+=1;
        	        }       
        	        
        	        int day = 0;
        	        if(x1<x2){
        	            for(int i=y1+1;i<=12;i++){
        	            	if(i==2) {
        	            		if(isLeapYear(x1)) {
        	            			day += 1;
        	            		}
        	            		
        	            	}
        	            	day += month[i%12];
        	            }
        	        }
        	        else {
        	        	for(int i=y1+1;i<y2;i++) {
        	        		day += month[i%12];
        	        		if(i==2) {
        	            		if(isLeapYear(x1)) {
        	            			day += 1;
        	            		}        		
        	        		}
        	        	}
        	        	day+= z2;
        	        }
        	        int b = x1+1;
        	        while(b<x2) {
        	        	day+=365;
        	        	if(isLeapYear(b)) {
        	        		day+=1;
        	        	}
        	        	b++;
        	        }
        	        if(b==x2) {
        	        	for(int i=1;i<y2;i++) {
        	        		day += month[i%12];
        	        		if(i==2) {
        	            		if(isLeapYear(b)) {
        	            			day += 1;
        	            		}        		
        	        		}
        	        	}
        	        	day+= z2;
        	        }
        	        int res = day + a;

        	        	System.out.println("D-"+res);
        	}
        }
        else {
      
        int a = month[y1 % 12]-z1;
        if(isLeapYear(x1) && y1 == 2) {
        	a+=1;
        }       
        
        int day = 0;
        if(x1<x2){
            for(int i=y1+1;i<=12;i++){
            	if(i==2) {
            		if(isLeapYear(x1)) {
            			day += 1;
            		}
            		
            	}
            	day += month[i%12];
            }
        }
        else {
        	for(int i=y1+1;i<y2;i++) {
        		day += month[i%12];
        		if(i==2) {
            		if(isLeapYear(x1)) {
            			day += 1;
            		}        		
        		}
        	}
        	day+= z2;
        }

        int b = x1+1;
        while(b<x2) {
        	day+=365;
        	if(isLeapYear(b)) {
        		day+=1;
        	}
        	b++;
        }

        if(b==x2) {
        	for(int i=1;i<y2;i++) {
        		day += month[i%12];
        		if(i==2) {
            		if(isLeapYear(b)) {
            			day += 1;
            		}        		
        		}
        	}
        	day+= z2;
        }
        int res = day + a;

        	System.out.println("D-"+res);
        }
    }

    private static boolean isLeapYear(int n){
        if(n%4 !=0 ){
            return false;
        }
        else{
            if(n%100 != 0){
                return true;
            }
            else {
            	if(n%400 != 0) {
            		return false;
            	}
            	else {
            		return true;
            	}
            }
        }
    }

}