import java.util.*;
import java.util.Stack;

public class browserHistory {
    static void backTracking(String command, ArrayDeque<String> stack) {
        if (command.equals("back")) {
            String lastUrl = stack.pop();
            System.out.printf("Last URL page: %s\n", lastUrl);
        } else {
            System.out.printf("Adding %s to browser history\n", command);
            stack.push(command);
        }
    }
    static void bilge(String command, ArrayDeque<String> stack){
        if (command.equals("back")) {
            System.out.println("No more pages back");
        } else {
            System.out.printf("Adding %s to browser history\n", command);
            stack.push(command);
        }
    }
    static boolean checkIfUrlExists(String command, ArrayDeque<String> stack){
//        boolean returnValue = (stack.contains(command)) ? (if true return true) : (if false return false)
        boolean lastUrl = stack.peek().equals(command);
        if (lastUrl){
            System.out.printf("%s is already added as the last URL in browser history.\n", command);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine();
            try {
                if (checkIfUrlExists(command, stack)){
                    continue;
                }
                backTracking(command, stack);
                }
             catch (Exception e) {
                bilge(command, stack);
            }
        }
    }
}