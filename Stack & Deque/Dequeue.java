import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Dequeue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split(" ");
        int numberOfTurns = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenDeque = new ArrayDeque<>();

        for (String child : children) {
            childrenDeque.offer(child);
        }
        while (childrenDeque.size() != 1){
            for (int i = 0; i < numberOfTurns; i++) {
                String currentChild = childrenDeque.poll();
                if (currentChild != null) {
                    childrenDeque.offer(currentChild);
                }
                String childToRemove = childrenDeque.poll();
                if (childToRemove != null){
                    System.out.printf("Removed %s\n", childToRemove);
                }
                }


            }
        System.out.printf("Winner is %s \n", childrenDeque.peek());
        }
    }


