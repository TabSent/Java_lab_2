package Tasks;

import java.util.Stack;

public class Task2 {

//Ввести число, занести его цифры в стек. Вывести в число, у которого цифры идут в
//обратном порядке

    public static void startStack(int num){
        Stack<String> stack = new Stack<>();
        String str = Integer.toString(num);
        for (int i = 0; i < String.valueOf(num).length(); i+=1) {
            stack.push(str.substring(i,i+1));
        }
        while(! stack.empty()) {
            System.out.print(Integer.parseInt(stack.pop()));
        }
    }
}
