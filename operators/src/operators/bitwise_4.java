package operators;
//Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers.
public class bitwise_4 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println(a<b & a>b);
	System.out.println(a<b | a>b);
	System.out.println(a<b ^ a>b);
	System.out.println(~a);
	System.out.println(~b);
}
}
