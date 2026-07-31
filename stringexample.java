import java.util.Scanner;
class stringexample{

    //Character count method to count consonants and vowels in a string
    public static void consonantCount(String str){
        int ccount = 0;
        int vcount = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                    ccount++;
                } else {
                    vcount++;
                }
            }
        }
        System.out.println("Number of consonants: " + ccount);
        System.out.println("Number of vowels: " + vcount);
    }


    //Character count method to count consonants, vowels, digits and special characters in a string
    public static void characterCount(String str){
        int ccount = 0;
        int vcount = 0;
        int ncount=0;
        int scount=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                    ccount++;
                } else {
                    vcount++;
                }
            }
            else if(ch>='0' && ch<='9'){
                ncount++;
            }
            else{
                 scount++;
            }
        }
        System.out.println("Number of consonants: " + ccount);
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of digits: " + ncount);
        System.out.println("Number of special characters: " + scount);
    }
    

    //Remove all Special characters from a string
    public static void removeSpecialCharacters(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                System.out.print(ch);
            }
        }
    }


    //Uppercase TO Lowercase conversion of a string by inbuilt method
    public static void iconvertCase(String str){
        String lower = str.toLowerCase();
        System.out.println(lower);
    }


    //Uppercase TO Lowercase conversion of a string without inbuilt method
    public static void convertCase(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch = (char)(ch + 32);
            }
            System.out.print(ch);
        }
    }

    //Trim method to remove leading and trailing spaces from a string wihout inbuilt method
    public static void trimString(String str){
    int i = 0; 
    int j = str.length() - 1;

    for(i = 0; i < str.length(); i++){
        if(str.charAt(i) != ' '){
            break;
        }
    }

    for(j = str.length() - 1; j >= 0; j--){
        if(str.charAt(j) != ' '){
            break;
        }
    }

    System.out.println(str.substring(i, j + 1));
}

//Trim method to remove leading and trailing spaces from a string with inbuilt method
public static void trimStringInbuilt(String str){ 
    
    System.out.println(str.trim());
}

//Remove extra spaces from a string without inbuilt method
public static void removeExtraSpaces(String str){
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch != ' '){
            System.out.print(ch);
        }
        else{
            if(i+1<str.length() && str.charAt(i+1) != ' '){
                System.out.print(ch);
            }
        }
    }
}

//String mainppulation to print * before a in the string without inbuilt method
public static void printa(String str){
    
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == 'a'||ch == 'A'){
            System.out.print("*");
        }
        System.out.print(ch);
    }
}


//String mainppulation to print * before a in the string with inbuilt method
public static void printaInbuilt(String str){
    str = str.replace("a", "*a");
    str = str.replace("A", "*A");
    System.out.println(str);
}


//index of character in a string without inbuilt method]
public static void indexOfCharacter(String str, char ch){
    for(int i=0;i<str.length();i++){
        if(str.charAt(i) == ch){
            System.out.println(i);
            return;
        }
    }
    System.out.println(ch + " not found in the string.");
}

//check the sequence of string in a string without inbuilt method
public static void checkSubstring(String str, String substr){
    
    int i = 0;
    int j = 0;
    while(i < str.length() && j < substr.length()){
        if(str.charAt(i) == substr.charAt(j)){
            j++;
        }
        i++;
    }
    if(j == substr.length()){
        System.out.println(" Yes");
    }
    else{
        System.out.println("No");
    }
}

//Print the all substring of length 4 from a string without inbuilt method
public static void printSubstring(String str){
    if(str.length() >= 4){
        for(int i = 0; i <= str.length() - 4; i++){
            System.out.println(str.substring(i, i + 4));
        }
    }
    else{
        System.out.println("String is too short.");
    }
}

//check if the given string s2 is present in s1 or not without inbuilt method
public static void checkSubstringPresent(String s1, String s2){
    int i = 0;
    int j = 0;
    while(i < s1.length() && j < s2.length()){
        if(s1.charAt(i) == s2.charAt(j)){
            j++;
        }
        else{
            j = 0;
        }
        i++;
    }
    if(j == s2.length()){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
}


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the substring to search: ");
        String s2 = sc.nextLine();

        checkSubstringPresent(s1, s2);

        sc.close();

    }
}
