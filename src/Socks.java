import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Socks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }


        System.out.println(stockMerchant(n, ar));
    }

    static int stockMerchant(int n, int[] ar) {
        if(ar.length == 1 || n == 1)return 0;
        int[] newArr = ar;
        ArrayList<Integer> pairOfSocks = new ArrayList<Integer>();
        Arrays.sort(newArr);
        for (int i = 0; i < n; i++) {
            if(i  == n - 1)break;
            if(newArr[i] == newArr[i + 1]) {
                pairOfSocks.add(newArr[i]);
                i += 1;
            }
        }
        return pairOfSocks.size();
    }
}
