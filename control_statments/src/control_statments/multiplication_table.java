package control_statments;
import java.util.*;

public class multiplication_table {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number:");
	        int number = sc.nextInt();

	        System.out.println("Multiplication Table for " + number + ":");

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }

	        sc.close();
	    }
	}

