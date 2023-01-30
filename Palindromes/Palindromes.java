import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        int lastNum = 0;
        int currentSum = 0;

        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
        System.out.printf("Input number is %d\n--------------\n", inputNum);
        int currentNum = inputNum;
        while (currentNum > 0){
            lastNum = currentNum % 10;
            System.out.printf("Current digit is %d\n", lastNum);
            System.out.printf("Digit %d was added to the currentSum %d\n", lastNum, (currentSum*10));
            currentSum = (currentSum * 10) + lastNum;
            currentNum = currentNum/10;
        }

        if (currentSum == inputNum){
            System.out.println("The digit is a palindrome");
            System.exit(1);
        }
        System.out.println("The digit  is not a palindrome.");

    }
}