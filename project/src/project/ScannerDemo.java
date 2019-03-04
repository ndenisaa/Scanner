package project;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class ScannerDemo {
	

	    public static void main(String[] arguments){
	        String username;
	        double age;
	        String gender;
	        int telephone_number;

	        // Allows a person to enter his/her name   
	        Scanner one = new Scanner(System.in);
	        System.out.println("Enter your name:" );  
	        username = one.next();
	        System.out.println("Name entered " + username);

	        // Allows a person to enter his/her age   
	        Scanner two = new Scanner(System.in);
	        System.out.println("Enter Age:" );  
	        age = two.nextDouble();
	        System.out.println("Age entered " + age);

	        // Allows a person to enter his/her gender  
	        Scanner three = new Scanner(System.in);
	        System.out.println("Enter Gender:" );  
	        gender = three.next();
	        System.out.println("Gender entered " + gender);

	        // Allows a person to enter his/her telephone number
	        Scanner four = new Scanner(System.in);
	        System.out.println("Enter Telephone number:" );  
	        telephone_number = four.nextInt();
	        System.out.println("Telephone number entered " + telephone_number);
	        
	        System.out.println("Your entered data:" + "\n"+ username + "\n" + age + "\n" +gender + "\n" + telephone_number);
	        String text = username + System.lineSeparator()+ age + System.lineSeparator() +gender + System.lineSeparator() + telephone_number;
	        FileWriter fWriter = null;
	        BufferedWriter writer = null;
	        try {
	          fWriter = new FileWriter("text.txt");
	          writer = new BufferedWriter(fWriter);
	          writer.write(text);
	          writer.newLine();
	          writer.close();
	          System.err.println("Your input of " + text.length() + " characters was saved into a text file.");
	        } catch (Exception e) {
	            System.out.println("Error!");
	        }
	    }
	}
