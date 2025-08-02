import java.util.*;

public class stu_marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter toatal sub");
        int s=sc.nextInt();
        int a[]= new int[6];
        System.out.println("Enter each sub marks");
        int t_marks=0;
        for(int i = 0; i < 6; i++) {

           a[i]=sc.nextInt();
           t_marks=t_marks+a[i];
        }

        for(int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
		System.out.println(t_marks);
		int avg=t_marks/s;
        System.out.println(avg);
    }
}
