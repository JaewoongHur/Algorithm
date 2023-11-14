import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            String[] startTime = input[0].split(":");
            String[] endTime = input[1].split(":");
            
            int startInSeconds = calculateSeconds(startTime);
            int endInSeconds = calculateSeconds(endTime);

            int count = countMultiplesOfThree(startInSeconds, endInSeconds);
            System.out.println(count);
        }
    }

    // 시:분:초를 초로 환산하는 함수
    private static int calculateSeconds(String[] time) {
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);
        return 3600 * hours + 60 * minutes + seconds;
    }

    // start 부터 end 까지 1초씩 증가하면서 3의 배수인 경우를 세는 함수
    private static int countMultiplesOfThree(int start, int end) {
        int count = 0;
        if (start <= end) {
            for (int seconds = start; seconds <= end; seconds++) {
                int sumOfDigits = getSumOfDigits(seconds);

                if (sumOfDigits % 3 == 0) {
                    count++;
                }
            }
        } else {
            // 시작 시각이 끝나는 시각보다 큰 경우 처리
            for (int seconds = start; seconds <= 24 * 3600 - 1; seconds++) {
                int sumOfDigits = getSumOfDigits(seconds);

                if (sumOfDigits % 3 == 0) {
                    count++;
                }
            }
            for (int seconds = 0; seconds <= end; seconds++) {
                int sumOfDigits = getSumOfDigits(seconds);

                if (sumOfDigits % 3 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 시계 정수의 각 자릿수를 더하는 함수
    private static int getSumOfDigits(int seconds) {
        int totalSeconds = seconds % 60;
        int totalMinutes = (seconds / 60) % 60;
        int totalHours = (seconds / 3600) % 24;
        return totalHours + totalMinutes + totalSeconds;
    }
}