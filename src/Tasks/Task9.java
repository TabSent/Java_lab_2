package Tasks;

import java.util.Scanner;
import java.util.Stack;

public class Task9 {

//Определить класс Stack. Объявить объект класса. Ввести последовательность
//символов и вывести ее в обратном порядке.

    public void stack() {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String[] a = scan.nextLine().split(" ");
        for (String i : a) {
            stack.push(i);
        }
        while (! stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
