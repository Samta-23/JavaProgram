package pck;
public class CreatePalindrome {
    public static void main(String[] args) {
        String str = "aaab"; // Example string
        int index = findIndexToRemoveToMakePalindrome(str);
        if (index == -1) {
            System.out.println("The string is already a palindrome.");
        } else {
            System.out.println("Remove character at index " + index + " to make the string a palindrome.");
        }
    }

    public static int findIndexToRemoveToMakePalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                // Check if removing character at left index makes it a palindrome
                if (isPalindrome(str, left + 1, right)) {
                    return left;
                }
                // Check if removing character at right index makes it a palindrome
                if (isPalindrome(str, left, right - 1)) {
                    return right;
                }
                // If removing both characters doesn't make it a palindrome, return -1
                return -1;
            }
            left++;
            right--;
        }
        // If the string is already a palindrome, return -1
        return -1;
    }

    public static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
