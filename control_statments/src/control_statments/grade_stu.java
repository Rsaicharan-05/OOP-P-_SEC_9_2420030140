package control_statments;
// Grade a student based on marks.
public class grade_stu {
	
	    public static void main(String[] args) {
	        int marks = 85; 

	        if (marks >= 90 && marks <= 100) {
	            System.out.println("Grade A");
	        } else if (marks >= 80) {
	            System.out.println("Grade B");
	        } else if (marks >= 70) {
	            System.out.println("Grade C");
	        } else if (marks >= 60) {
	            System.out.println("Grade D");
	        } else {
	            System.out.println("Grade Fail");
	        }
	    }
	}

