package random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumInWords {

String val = "";
Map<Integer, String> map = new HashMap<Integer, String>();

NumInWords(){
	map.put(0, " ");
	map.put(1, "one");
	map.put(2, "two");
	map.put(3, "three");
	map.put(4, "four");
	map.put(5, "five");
	map.put(6, "six");
	map.put(7, "seven");
	map.put(8, "eight");
	map.put(9, "nine");
	map.put(10, "ten");
	map.put(11, "eleven");
	map.put(12, "twelve");
	map.put(14, "fourteen");
	map.put(13, "thirteen");
	map.put(15, "fifteen");
	map.put(16, "sixteen");
	map.put(17, "seventeen");
	map.put(18, "eighteen");
	map.put(19, "nineteen");
	map.put(20, "twenty");
	map.put(30, "thirty");
	map.put(40, "forty");
	map.put(50, "fifty");
	map.put(60, "sixty");
	map.put(70, "seventy");
	map.put(80, "eighty");
	map.put(90, "ninety");
	map.put(100, "hundred");
	map.put(1000, "thousand");
	map.put(100000, "lakh");
	map.put(10000000, "crore");
}


public String getNum(int tmp){
	String val = "";
	
	if (tmp <= 20){
		return map.get(tmp);
	}
	if(tmp > 10){
		int s = tmp/10 *10;
		val += " " + map.get(s);
		val += " " + map.get(tmp - s);		
	}
	
	return val;
}
public String toText(int num){
	int tmp = num;
	String val = "";
	if (tmp==0){
		val = "Zero";
	}else{
		
		while (tmp > 0){
			if (tmp/100000000 >= 1 ){
				val += " " + getNum(tmp/10000000);
				val += " " + map.get(10000000);
				tmp = tmp - (tmp/10000000)*10000000;
			}
			if (tmp/100000 >= 1){
				val += " " + (getNum(tmp/100000));
				val += " " + map.get(100000);
				tmp = tmp - (tmp/100000)*100000;
			}
			if(tmp/1000 >= 1){
				val += " " + getNum(tmp/1000);
				val += " " + map.get(1000);
				tmp = tmp - (tmp/1000)*1000;
			}
			if(tmp/100 >= 1){
				val += " " + getNum(tmp/100);
				val += " " + map.get(100);
				tmp = tmp - (tmp/100)*100;
			}
			if (tmp < 100 && tmp >= 0){
				val += " " + getNum(tmp); 
				tmp = 0;
			}
			}
	}
return val;	
}


public static void main(String o[])throws IOException{
	NumInWords ob = new NumInWords();
	boolean flag =  true;
	while (flag){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		int num = Integer.parseInt(br.readLine());
		System.out.println(ob.toText(num));
	}
	}//end main
}//endOfClass
