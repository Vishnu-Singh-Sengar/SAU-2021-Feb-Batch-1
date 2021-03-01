package primeExceptions;

public class MainApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrime obj=new checkPrime();
		
		try {
			for(int i=1;i<=100;i++)
			{
				if(obj.check(i)) {
					throw new ArithmeticException("Prime Number Found: "+i);
				}
			}
		}
		catch (Exception e){
			System.out.println("Prime Number was found");
		}
		
	}

}
