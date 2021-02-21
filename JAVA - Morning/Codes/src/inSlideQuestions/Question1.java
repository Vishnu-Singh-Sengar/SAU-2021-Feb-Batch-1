package inSlideQuestions;
import java.util.*;
//========================== ACCOLITE UNIVERSITY JAVA ASSIGNMENT=============================
//-------------------------------------------------------------------------------------------
//========================== VISHNU SINGH SENGAR=============================================
//-------------------------------------------------------------------------------------------

public class Question1 
{
    public static void main(String[] args)
    { 
    	Scanner inp = new Scanner(System.in);
    	System.out.println("Enter the number of Expressions");
        int n= inp.nextInt();
        for(int co=0;co<n;co++) {
	        Stack<Integer> op  = new Stack<Integer>();
	        Stack<Double> val = new Stack<Double>();
	        Stack<Integer> optmp  = new Stack<Integer>();
	        Stack<Double> valtmp = new Stack<Double>();
	        System.out.println("\nEnter expression\n");
	        String input = inp.next();
	        input = "0" + input;
	        input = input.replaceAll("-","+-");
	        String temp = "";
	        for (int i = 0;i < input.length();i++)
	        {
	            char ch = input.charAt(i);
	            if (ch == '-')
	                temp = "-" + temp;
	            else if (ch != '+' &&  ch != '*' && ch != '/')
	               temp = temp + ch;
	            else
	            {
	                val.push(Double.parseDouble(temp));
	                op.push((int)ch);
	                temp = "";
	            }
	        }
	        val.push(Double.parseDouble(temp));
	        char operators[] = {'/','*','+'};
	        for (int i = 0; i < 3; i++)
	        {
	            boolean it = false;
	            while (!op.isEmpty())
	            {
	                int optr = op.pop();
	                double v1 = val.pop();
	                double v2 = val.pop();
	                if (optr == operators[i])
	                {
	                    if (i == 0)
	                    {
	                        valtmp.push(v2 / v1);
	                        it = true;
	                        break;
	                    }
	                    else if (i == 1)
	                    {
	                        valtmp.push(v2 * v1);
	                        it = true;
	                        break;
	                    }
	                    else if (i == 2)
	                    {
	                        valtmp.push(v2 + v1);
	                        it = true;
	                        break;
	                    }                                        
	                }
	                else
	                {
	                    valtmp.push(v1);
	                    val.push(v2);
	                    optmp.push(optr);
	                }                
	            }              
	            while (!valtmp.isEmpty())
	                val.push(valtmp.pop());
	            while (!optmp.isEmpty())
	                op.push(optmp.pop());
	            if (it)
	                i--;                            
	        }    
	        System.out.println(val.pop());        
	    }
    }
}