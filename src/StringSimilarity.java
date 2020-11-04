public class StringSimilarity {
    public static void main(String[] args) {
        System.out.println(stringSimilarity("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
    }

    static int stringSimilarity(String s) {
        int c = s.length();
        int L = 0, R = 0, n=s.length();
        char[] listS = s.toCharArray();
        int []z=new int[n];
        for (int i = 1; i < n; i++) {
            if (i > R) {
                L = R = i;
                while (R < n && listS[R-L] == listS[R]) R++;
                z[i] = R-L;
                c+=z[i];
                R--;
            } else {
                int k = i-L;
                if (z[k] < R-i+1) {
                    z[i] = z[k];
                    c+=z[i];
                }
                else {
                    L = i;
                    while (R < n && listS[R-L] == listS[R]) R++;
                    z[i] = R-L;
                    c+=z[i];
                    R--;
                }
            }
        }
        return c;
    }
}
