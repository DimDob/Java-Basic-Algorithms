public class primeNumbersFounder {

    public static void main(String[] args) {

        int i;
        int num = 0;
        int maxCheck = 100;
        boolean isPrime = true;

        String primeNumbersFound = "";
        for (int j = 2; j < maxCheck; j++) {
            isPrime = checkPrime(j);
            if (isPrime){
                primeNumbersFound = primeNumbersFound + j + " ";
            }
        }


        System.out.printf("Prime numbers from 1 to %d are %s", maxCheck, primeNumbersFound);
    }

    public static boolean checkPrime(int number){
        int remainder;
        for (int i = 2; i < number/2; i++) {
            remainder = number % i;
            if (remainder == 0 ){
                return false;
            }
        }
        return true;
    }
}
