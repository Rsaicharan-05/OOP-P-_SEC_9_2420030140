import java.util.*;
public class duplicate_ele {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a[] = new int[5];
	        System.out.println("Enter 5 numbers");
	        for(int i = 0; i < 5; i++)
	            a[i] = sc.nextInt();
	        System.out.println("duplicate elements");
	        for(int i = 0; i < 5; i++) {
	            boolean b = false;
	            for(int j = 0; j < i; j++) {
	                if(a[i] == a[j]) {
	                    b = true;
	                    break;
	                }
	            }
	            if(!b)
	                System.out.print(a[i] + " ");
	        }
	    }
	}


