import java.util.Objects;
import java.util.Scanner;

public class StringManipulations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        System.out.printf("Reversed message: %s\n", reverse(inputStr));
        System.out.printf("Encrypted message: %s\n", asciiEncription(inputStr));
        System.out.printf("Decrypted message: %s", asciiDecription(inputStr));
    }
    public static String  asciiDecription(String str){
        StringBuilder decryptedVal = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            char chr = (char) str.charAt(index);
            decryptedVal.append(chr);
        }
        return decryptedVal.toString();
    }
    public static String asciiEncription(String str){
        StringBuilder encriptedVal = new StringBuilder();
        for (int i = 0; i < str.length()-1 ; i++) {

            int asciiVal = (int) str.charAt(i);
            encriptedVal.append(asciiVal);
        }
        return encriptedVal.toString();
    }
   public static String reverse(String str){
        StringBuilder result = new StringBuilder();
        for (int index = str.length()-1; index >= 0; index--) {
           String currentChar = Objects.toString(str.charAt(index));
           result.append(currentChar);
        }
        return result.toString();
   }
}
