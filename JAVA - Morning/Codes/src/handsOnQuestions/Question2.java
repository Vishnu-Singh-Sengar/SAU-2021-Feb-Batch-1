package handsOnQuestions;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		TreeMap<String,String> dict= new TreeMap<>();
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter the number of key->value pairs");
		int n=inp.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Key");
			String key=inp.next();
			System.out.println("Enter Value");
			String val=inp.next();
			dict.put(key, val);
		}
		System.out.println("Original Map: "+dict);
		System.out.println("Reversed Map: "+ dict.descendingKeySet());
	}
	

}
