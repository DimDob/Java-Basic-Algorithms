public class fibonacciForLoop {

    public static void main(String[] args) {
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;


        System.out.printf("Fibbonaci Serios of %d numbers\n", maxNumber);

        for (int i = 0; i < maxNumber; i++) {
            System.out.println(previousNumber);
            int currentSum = nextNumber + previousNumber;
            previousNumber = nextNumber;
            nextNumber = currentSum;


        }
    }
}