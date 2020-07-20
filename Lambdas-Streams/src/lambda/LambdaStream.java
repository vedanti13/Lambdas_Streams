package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaStream {
	 
	static boolean isPalindrome(String text){
	       String temp = text.replaceAll("\\s+", "").toLowerCase();
	        return IntStream.range(0, text.length() / 2)
	            .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> intList = Arrays.asList(1,2,2,3,1,5);

	    Double average = intList.stream().mapToInt(val -> val).average().orElse(0.0);
	    System.out.println("Average: "+average);
	    
	    List<String> stringCollection = new ArrayList<>();
	    stringCollection.add("ddd2");
	    stringCollection.add("aaa2");
	    stringCollection.add("bbb1");
	    stringCollection.add("aaa1");
	    stringCollection.add("bbb3");
	    stringCollection.add("ccc");
	    stringCollection.add("bbb2");
	    stringCollection.add("ddd1");

	    boolean anyStartsWithA = stringCollection.stream().anyMatch(
	        (s) -> s.startsWith("a"));

	    System.out.println("Starts with a: "+anyStartsWithA);
	    
	   
	    System.out.println("Pallindrome: "+isPalindrome("php"));
	}
}
