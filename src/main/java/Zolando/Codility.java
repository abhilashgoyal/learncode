package Zolando;

import java.util.HashMap;
import java.util.Map;

public class Codility {

    public int question3NumberOfPairs(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int x : A){
            int tempCount = countMap.getOrDefault(x,0);
            countMap.put(x, ++tempCount);
        }
        int count = 0;
        for(int n : countMap.values()){
            if(n > 1){
                count += ((n * (n-1))/2);
            }
        }
        return count;
    }

    public int question2BinaryOperations(String S) {
        // write your code in Java SE 8
        StringBuilder input = new StringBuilder(S);
        StringBuilder result = new StringBuilder("0");
        int count = 0;
        while(Integer.parseInt(input.toString()) != 0){
            // even number, divide by 2
            if('0' == input.charAt(input.length() - 1)){
                divideBinaryNumberBy2(input);
            }else {
                subtract1FromBinaryNumber(input);
            }
            count++;
        }
        return count;
    }

    private void divideBinaryNumberBy2(StringBuilder input) {
        input.deleteCharAt(input.length()-1);
    }

    private void subtract1FromBinaryNumber(StringBuilder input) {
        // odd number, subtract 1
        for(int i = input.length()-1;i>0;i--){
            if('0' == input.charAt(i)){
                input.setCharAt(i, '1');
            }else {
                input.setCharAt(i, '0');
                break;
            }
        }
    }

    public int question1BulbQuestion(int [] A) {
        // write your code in Java SE 8
        int counter = 0;
        int circuit = 0;
        for(int i = 0; i< A.length; i++){
            // turn on the nth buld
            circuit = ((1 << (A[i]-1)) | circuit);
            if(isSet(circuit)){
                counter++;
            }// end If
        }
        return counter;
    }

    private boolean isSet(int n){
        while (n > 0){
            if(( n & 1) == 0){
                return false;
            }
            n = n >> 1;
        }// wnd while
        return true;
    }

    public static void main(String o []){
        Codility ob = new Codility();
        int [] input = {2, 1, 3, 5, 4};
        int [] pairInput = {3,5,6,3,3,5};
        System.out.println(ob.question3NumberOfPairs(pairInput));
        System.out.println(ob.question2BinaryOperations("011100"));
        System.out.println(ob.question1BulbQuestion(input));
        System.out.println(ob.isSet(8));
        System.out.println(ob.isSet(3));
        System.out.println(ob.isSet(2));
    }
}
