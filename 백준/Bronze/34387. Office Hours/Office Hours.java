import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		 int N = Integer.parseInt(br.readLine().trim());
		 
	        // 요일 이름 배열 (출력용)
	        String[] dayNames = {
	            "Sunday", "Monday", "Tuesday", "Wednesday",
	            "Thursday", "Friday", "Saturday"
	        };

	        // 요일 문자열 -> 인덱스 매핑
	        java.util.HashMap<String, Integer> dayIndex = new java.util.HashMap<>();
	        for (int i = 0; i < dayNames.length; i++) {
	            dayIndex.put(dayNames[i], i);
	        }
	        
	        // 각 (요일, 시간)에 대해 학생 이름 Set
	        @SuppressWarnings("unchecked")
	        HashSet<String>[][] sets = new HashSet[7][24];

	        for (int i = 0; i < N; i++) {
	            String line = br.readLine();
	            if (line == null || line.isEmpty()) {
	                i--;
	                continue;
	            }
	            st = new StringTokenizer(line);

	            String name = st.nextToken();       // 학생 이름
	            String dayStr = st.nextToken();     // 요일
	            int x = Integer.parseInt(st.nextToken()); // 가능한 시간 개수

	            int d = dayIndex.get(dayStr);

	            for (int k = 0; k < x; k++) {
	                int h = Integer.parseInt(st.nextToken()); // 시간 (0~23)

	                if (sets[d][h] == null) {
	                    sets[d][h] = new HashSet<>();
	                }
	                sets[d][h].add(name);
	            }
	        }

	        // 최적의 (요일, 시간) 찾기
	        int bestDay = 0;
	        int bestHour = 0;
	        int bestCount = -1;

	        for (int d = 0; d < 7; d++) {
	            for (int h = 0; h < 24; h++) {
	                int cnt = (sets[d][h] == null) ? 0 : sets[d][h].size();
	                if (cnt > bestCount) {
	                    bestCount = cnt;
	                    bestDay = d;
	                    bestHour = h;
	                }
	            }
	        }

	        String timeStr = String.format("%02d:00", bestHour);
	        String result = String.format(
	            "Your professor should host office hours %s @ %s",
	            dayNames[bestDay], timeStr
	        );

	        System.out.println(result);
		
	}
}