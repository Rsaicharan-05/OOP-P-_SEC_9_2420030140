import java.util.*;
public class small_large_ele {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int[] a = new int[5];
	        System.out.println("Enter numbers");
	        for(int i = 0; i < 5; i++)
	            a[i] = sc.nextInt();
	        int min = a[0];
	        	int max = a[0];
	        for(int i = 1; i < 5; i++) {
	            if(a[i] < min) {
	            	min = a[i];
	            }
	            if(a[i] > max) {
	            	max = a[i];
	            }
	        }
	        System.out.println("Min=" + min);
	        System.out.println("Max=" + max);
	    }
	}


