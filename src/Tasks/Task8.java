package Tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Task8 {

//Задать два стека, поменять информацию местами.

    public static void t8(){

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack2.push(6);
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);
        stack2.push(10);
        System.out.println("Before: " + "\n" + stack1 + "\n" + stack2);

        Iterator<Integer> iter1 = stack1.iterator();
        Iterator<Integer> iter2 = stack2.iterator();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        while(iter1.hasNext()) {
            list.add(iter1.next());
        }

        while(iter2.hasNext()) {
            list2.add(iter2.next());
        }

        stack1.clear();
        for (Integer integer : list2) {
            stack1.push(integer);
        }

        stack2.clear();

        for (Integer integer : list) {
            stack2.push(integer);
        }

        System.out.println("After: " + "\n" + stack1 + "\n" + stack2);

    }
}
