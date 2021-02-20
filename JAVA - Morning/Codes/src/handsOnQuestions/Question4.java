package handsOnQuestions;
import java.io.*;
import java.util.*;

class Data implements Serializable {
	 UUID serialversionUID = new UUID(100,10);
	 transient int id;
	 transient int age;
	 String name;
	 
	 
	 public Data(int id, String name, int age)
	 {
		 this.id = id;
		 this.name = name;
		 this.age = age;
	 }
}
 public class Question4{ 
	 public static void display(Data d){
		 System.out.println("ID Data: " + d.id);
		 System.out.println("Name Data: " + d.name);
		 System.out.println("Age Data: " + d.age);		 
	 }
	 public static void main(String []args){
		 Data d1 = new Data(1, "Vishnu Singh Sengar", 21);
		 try {
			 System.out.println("\nSerializing\n");
			 FileOutputStream file = new FileOutputStream("dataFile.txt");
			 ObjectOutputStream out = new ObjectOutputStream(file);
			 out.writeObject(d1);
			 out.close();
			 file.close();
			 System.out.println("Data before deserialization:\n ");
			 display(d1);
		 }
		 catch (Exception e) {
			 System.out.println("Exception Caught");
		 }
		 d1 = null;
		 try {
			 System.out.println("\nDeserializing\n");
			 FileInputStream file = new FileInputStream("dataFile.txt");
			 ObjectInputStream in = new ObjectInputStream(file);
			 d1 = (Data) in.readObject();
			 in.close();
			 file.close();
			 System.out.println("\n\nData after deserialization:\n ");
			 display(d1);
		 }
		 catch (Exception e) { 
			 System.out.println("Exception Caught");
		 }
	 }
	 
 }
