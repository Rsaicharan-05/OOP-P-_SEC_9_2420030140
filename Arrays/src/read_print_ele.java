import java.util.*;
public class read_print_ele {
	
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a[] = new int[5];

	        System.out.println("Enter 5 numbers");
	        for(int i = 0; i < 5; i++)
	            a[i] = sc.nextInt();

	        System.out.println("entered");
	        for(int i = 0; i < 5; i++)
	            System.out.println(a[i]);
	    }
	}

