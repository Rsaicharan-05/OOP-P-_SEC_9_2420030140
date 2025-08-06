import java.util.*;
public class multiple_str {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine(); 
	        System.out.println("Length=" + s.length());
	        System.out.println("Character=" + s.charAt(7));
	        System.out.println("Substring begin & end=" + s.substring(0,9));
	        System.out.println("Equals 'hello'=" + s.equals("hello"));
	        System.out.println("EqualsIgnore 'hello'=" + s.equalsIgnoreCase("hello"));
	        System.out.println("Compare=" + s.compareTo("hello"));
	        System.out.println("ComapreIgnore=" + s.compareToIgnoreCase("hello"));
	        System.out.println("Contains 'a'=" + s.contains("a"));
	        System.out.println("Start with=" + s.startsWith("haii"));
	        System.out.println("End with=" + s.endsWith("byee"));
	        System.out.println("Index=" + s.indexOf("3"));
	        System.out.println("Last Index=" + s.lastIndexOf("charan"));
	        System.out.println("Trim=" + s.trim());
	        System.out.println("Replace=" + s.replace("hi","hee"));
	        System.out.println("Replace all=" + s.replaceAll("slaar","yoo"));
	        System.out.println("Replace first=" + s.replace("hi","hulk"));
	        System.out.println("Lowercase" + s.toLowerCase());
	        System.out.println("Uppercase=" + s.toUpperCase());
	        System.out.println("Character Array=" + s.toCharArray());
	        System.out.println("Empty=" + s.isEmpty());
	        System.out.println("Value of=" + s.valueOf(s));
	       
	    }
	}


