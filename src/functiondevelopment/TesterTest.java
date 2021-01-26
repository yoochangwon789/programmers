package functiondevelopment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TesterTest {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        List<Integer> integersTest = new ArrayList<>();

        while (!stack.isEmpty()) {
            int a = stack.pop();
            System.out.println(stack);
            integersTest.add(a);
        }
        System.out.println(integersTest);
    }
}
