package hackerrank.interviewprepkit.dp;

import java.io.IOException;
import java.util.*;

public class Abbreviation {
    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {
        String result = "YES";

        char[] source = a.toCharArray();
        Set<Integer> sourceSet = new HashSet<Integer>();
        for(char x: source){
            sourceSet.add((int)x);
        }

        char[] target = b.toCharArray();
        Set<Integer> targetSet = new HashSet<Integer>();
        for(char x: target){
            targetSet.add((int)x);
        }

        targetSet.removeAll(sourceSet);

        if(targetSet.size() == 0){
            return "YES";
        }

        for(Integer x : targetSet){
            if((x >= 65 &&  x<=90) && !sourceSet.contains(x+32)){
                return "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);
            System.out.println(result);
        }

        scanner.close();
    }
}
