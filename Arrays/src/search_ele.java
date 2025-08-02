
import java.util.*;

public class search_ele {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter number to search");
        int n = sc.nextInt();

        for(int i = 0; i < 5; i++) {
            if(a[i] == n) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
}
