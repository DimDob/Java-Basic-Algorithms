


public class fibonacciRecursive {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
    public static void main(String args[]) {
        int maxNumber = 10;
//        System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
        System.out.printf("Fibonacci numbers in range %d:\n", maxNumber);
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fib(i) +" ");
        }
    }
}