package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {

//Не используя вспомогательных объектов, переставить отрицательные элементы
//данного списка в конец, а положительные - в начало этого списка.

    public static void std() {
        ArrayList<Integer> mass = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        for (String s : line) {
            mass.add(Integer.parseInt(s));
        }

        for (int i = mass.size()-1; i>=0; i--){
            if (mass.get(i)<0){
                mass.add(mass.get(i));
                mass.remove(i);
            }
        }
        System.out.println(mass);

    }
}
