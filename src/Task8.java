public class Task8 {

    public static void main(String[] args) {
        System.out.println(isNumeric("12345"));  // Output: true
        System.out.println(isNumeric("123a5"));  // Output: false
        System.out.println(isNumeric(""));       // Output: false
        System.out.println(isNumeric(null));     // Output: false
    }

    /**
     * This function checks if the given string consists only of digits.
     * It returns false if the string is null or empty.
     * Otherwise, it checks each character and returns false if any character is not a digit.
     * Time Complexity: O(n), where n is the length of the string,
     * since we may have to examine each character once.
     */
    public static boolean isNumeric(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
