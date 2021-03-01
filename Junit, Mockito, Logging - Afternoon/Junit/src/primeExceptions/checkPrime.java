package primeExceptions;

public class checkPrime {
	public boolean check(int num) {
		int i=2;
		boolean flag = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }
	    
	    return !flag;
	}

}
