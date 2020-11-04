import java.util.Scanner;

public class Valley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.next();

        printValley(n, s);
        System.out.println(countValley(n, s));
    }

    static void printValley(int n, String valley) {
        System.out.print("-");
        for (int i = 0; i < n; i++) {
            if(valley.substring(i, i+1).equalsIgnoreCase("d")) {
                System.out.print("\\");
            }else if(valley.substring(i, i+1).equalsIgnoreCase("u")) {
                System.out.print("/");
            }
        }
        System.out.print("-");
        System.out.println();
    }

    static int countValley(int n, String valley) {
        int totalCount = 0;
        int currentCount = 0;
        for (int i = 0; i < n; i++) {
            String elevation = valley.substring(i, i+1);
            if(elevation.equalsIgnoreCase("d")) {
                currentCount--;
            }else if(elevation.equalsIgnoreCase("u")) {
                currentCount++;
            }

            if(currentCount == 0 && elevation.equalsIgnoreCase("u")){
                totalCount++;
            }
        }
        return totalCount;
    }
}
