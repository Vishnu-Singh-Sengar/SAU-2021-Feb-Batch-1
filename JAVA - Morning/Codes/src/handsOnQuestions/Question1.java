package handsOnQuestions;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter the original string: ");
		String oriString=inp.nextLine();
		
		System.out.println("Enter the word to be replaced: ");
		String regEx=inp.nextLine();
		
		System.out.println("Enter the replacement word: ");
		String tarWord=inp.nextLine();
		
		String newStr=oriString.replaceAll(regEx, tarWord);
		
		System.out.println("Original String: "+oriString);
		System.out.println("New String: "+newStr);

	}

}
