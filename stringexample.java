import java.util.Scanner;

class stringexample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

    System.out.println(str);
        int count = 1;
        int i = str.length()-1;
            while(i >= 0 && str.charAt(i) != 'a'&&str.charAt(i) != 'e'&&str.charAt(i) != 'i'&&str.charAt(i) != 'o'&&str.charAt(i) != 'u') {
                i--;
            }
            count++;
            System.out.println(count);
    }

}
