import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Xendit {
    public static void main(String[] args){
        
    }

    public static void commonSubstring(List<String> a, List<String> b) {
        // Write your code here
        int count = a.size();
        for (int i = 0; i < count; i++) {
            //get every iterable array
            Set set1 = new HashSet(Arrays.asList(a.get(i).split("")));
            Set set2 = new HashSet(Arrays.asList(b.get(i).split("")));

            Set set3 = new HashSet(set1);
            set3.addAll(set2);

            if(set3.size() == set1.size() + set2.size()){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }

    //sx, sy, tx, ty
    public static String canReach(int x1, int y1, int x2, int y2) {
        // Write your code here

        if(x1 == x2){
            boolean isReach1 = y2 >= y1 && (y2 - y1) % x1 == 0;
            return isReach1 ? "Yes" : "No";
        }

        if(y1 == y2){
            boolean isReach2 = x2 >= x1 && (x2 - x1) % y2 == 0;
            return isReach2 ? "Yes" : "No";
        }

        if(x1 >= x2 || y1 >= y2){
            return "No";
        }

        return canReach(x1, y1, x2 % y2, y2 % x2);
    }

    //this is only pass first test case
    public static int segment(int x, List<Integer> arr) {
        // Write your code here
        int max = 0;
        int n = arr.size();
        for (int i = 0; i <= n - x; i++) {
            max = arr.get(i);
            for (int j = 1; j < x; j++) {
                if(arr.get(i + j) > max){
                    max = arr.get(i + j);
                }
            }
        }
        return max;
    }
}
