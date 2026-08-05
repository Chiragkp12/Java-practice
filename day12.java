import java.util.Scanner;

public class day12 {

    //string to Array of words
    public static String[] stringToArray(String str) { 
        String[] words = str.split(" ");
        return words;
    }

    // Method to reverse a single word
    public static String reverseString(String word) {
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }

        return rev;
    }

    // Reverse every word in the sentence
    public static void reverseWords(String str) {
        String reversedString = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                reversedString += reverseString(word) + " ";
                word = "";
            }
        }

        // Reverse the last word
        reversedString += reverseString(word);

        System.out.println(reversedString);
    }

    //reverse the string with words in same format
    public static String reverseEntireString(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    //reverse the string with words in same format
    public static String reverseStringWithWords(String str) {   
        String rev = "";
        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                word = str.charAt(i) + word;
            } else {
                rev += word + " ";
                word = "";
            }
        }

        rev += word;

        return rev;
    }

    //swapping alternative words in the string
    public static String swapAlternativeWords(String str) {
        String[] words = stringToArray(str);
        String swappedString = "";

        for (int i = 0; i < words.length; i += 2) {
            if (i + 1 < words.length) {
                swappedString += words[i + 1] + " " + words[i] + " ";
            } else {
                swappedString += words[i] + " ";
            }
        }

        return swappedString.trim();
    }

    //count the number of words in the string
    public static int countWords(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count + 1;
    }

    //count the number of characters in the string
    public static int countCharacters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        return count;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        reverseWords(str);
        System.out.println(reverseEntireString(str));
        System.out.println(reverseStringWithWords(str));
        System.out.println(swapAlternativeWords(str));
        System.out.println(countWords(str));
        System.out.println(countCharacters(str));

        sc.close();
    }
}