package handsOnQuestions;
import java.util.*;

class ExceptPrime extends Exception{
	
}

public class Question3 {
	public static boolean checkPrime(int n) {
		if(n<=1)
			return false;
		if(n<=3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
			if(n%i==0 || n%(i+2)==0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		int count=1;
		while(count<=100) {
			try {
				if(checkPrime(count))
					throw new ExceptPrime();
			}
			catch(ExceptPrime e) {
				System.out.println(count+" is a Prime Number");
			}
			finally {
				count++;
			}
		}
	}
	

}
