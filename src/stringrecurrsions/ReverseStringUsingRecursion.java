package stringrecurrsions;

public class ReverseStringUsingRecursion {

    public static String reverseStr(String str) {
        if (str.isEmpty())
            return str;
        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseStr(str));
    }
}
