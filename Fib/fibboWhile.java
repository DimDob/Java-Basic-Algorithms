public class fibboWhile {
    public static void main(String[] args) {

        int maxNumbers = 10 ;
        int previousNumber =  0;
        int nextNumber = 1;
        int counter = 0;
        System.out.println("Fibonacci sequence:");
        while (counter < maxNumbers){
            System.out.printf("%d\n", previousNumber);
            int currentSum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = currentSum;
            counter ++;
        }


    }
}
