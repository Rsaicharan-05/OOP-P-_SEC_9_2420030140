package wapperclasses;

public class unboxing {
    public static void main(String[] args) {
        int i = 140;
        System.out.println(new String(intValue(i)));

        long l = 24200301401L;
        System.out.println(new String(longValue(l)));
    }

    private static char[] longValue(long l) {
        return Long.toString(l).toCharArray(); 
    }

    private static char[] intValue(int i) {
        return Integer.toString(i).toCharArray(); 
    }
}
