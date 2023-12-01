import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < testCases; t++) {
            String saschaWord = scanner.nextLine();
            int dictionarySize = Integer.parseInt(scanner.nextLine());
            String[] dictionary = new String[dictionarySize];

            for (int i = 0; i < dictionarySize; i++) {
                dictionary[i] = scanner.nextLine();
            }

            String mostLikelyWord = findMostLikelyWord(saschaWord, dictionary);
            System.out.println(mostLikelyWord);
        }

        scanner.close();
    }

    private static String findMostLikelyWord(String saschaWord, String[] dictionary) {
        String result = "";
        int minSubstitutions = Integer.MAX_VALUE;

        for (String word : dictionary) {
            int substitutions = countSubstitutions(saschaWord, word);
            if (substitutions < minSubstitutions) {
                minSubstitutions = substitutions;
                result = word;
            }
        }

        return result;
    }

    private static int countSubstitutions(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}