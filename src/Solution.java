
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi(" "));
	}
    public static int myAtoi(String str) {
        int sign = 1, base = 0, i = 0;
        int INT_MIN = Integer.MIN_VALUE;
        int INT_MAX = Integer.MAX_VALUE;
        
        // Read in and ignore any leading whitespace
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        
        // Check if the next character is '-' or '+'
        if (i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        
        // Read in next the characters until the next non-digit character or the end of the input is reached
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        
        // Change the sign as necessary
        return base * sign;
    }
}
