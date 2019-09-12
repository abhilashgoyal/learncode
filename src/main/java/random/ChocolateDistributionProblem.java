package random;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ChocolateDistributionProblem {

	class Structure{
		int[] arr;
		int index;
	}
	
   /* static int equal(int[] arr) {
        
    }*/
    
    public Structure add(int[] arr, int addNumber){
        int flag = 0;
        int index;
        int numberOfDistinct;
        int maxNumber = -1;
        Structure arrayToReturn = new Structure();
        for(int i = 0; i < arr.length ; i++){
            if(i != flag)
                arr[i] += addNumber;
            /*Set<Integer> mySet = toSet(arr);
            numberOfDistinct = arrSet.size();
            if(maxNumber > numberOfDistinct){
            	maxNumber = numberOfDistinct;
            	arrayToReturn.arr = arr;
            	arrayToReturn.index = i;
            }*/
            flag++;
        }
        return arrayToReturn;
    }
    
    public Set<Integer> toSet(Integer[] arr){
    	Set<Integer> toReturn;
    	List<Integer> list = Arrays.asList(arr);
    	toReturn = new HashSet<Integer>(list);
    	return toReturn;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ChocolateDistributionProblem ob = new ChocolateDistributionProblem();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            //int result = equal(arr);
            Structure structure =  ob.add(arr, 1);
            System.out.println(structure.arr);
        }
        in.close();
    }
}