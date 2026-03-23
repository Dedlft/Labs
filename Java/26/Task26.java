import java.util.ArrayList;
import java.util.Stack;

public class Task26{
    public static Stack<Integer> pushStack(int[] StartArray){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(StartArray[i]);
        }
        return stack;
    }
    public static ArrayList<Integer> pullStack(Stack<Integer> stack1){
        ArrayList<Integer> Array1 = new ArrayList<>();
        int i=0;
        while (!stack1.isEmpty()){
            Array1.add(stack1.pop());
            i++;
        }
        return Array1;
    }
    public static void main(String[] args) {
        int[] StartArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Изначальный массив: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        Stack<Integer> stack1 = pushStack(StartArray);
        System.out.println("Инвертированный массив: "+pullStack(stack1));
    }
}
