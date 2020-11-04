import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Repeat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
    }

    static long repeatedString(String s, long n){
        if(s.length() == 1 && s.equalsIgnoreCase("a")) return n;
        if(!s.contains("a")) return 0;
        String word = "";
        int count = 0;
        int pointer = 0;

        for (int i = 0; i < n; i++) {
            int countWord = s.length();
            int wordIndex = countWord - (countWord - pointer);
            word += s.substring(wordIndex, wordIndex + 1);
            if (pointer == countWord - 1) pointer = 0;
            else pointer++;
        }

        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher(word);
        while(matcher.find()) {
            count++;
        }
        return count;
    }


}
