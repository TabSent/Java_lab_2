package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Task11 {


    public void t11(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int j : a) {
            set.add(j);
        }
        for(int k : b){
            set2.add(k);
        }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер 1 множествa");
        int n = scanner.nextInt();
        System.out.println("Введите размер 2 множества");
        int n2 = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            set.myAdd(((int) ((Math.random() + 0.1) * 10)));
        }
        for (int j = 0; j < n2; j++) {
            set2.myAdd((int) ((Math.random() + 0.1) * 10));
        }*/
        System.out.println(set + " " + set2);
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set);
        set3.addAll(set2);
        System.out.println(set3);
        set3.clear();
        for (Integer i : set) {
            if (set2.contains(i)) {
                set3.add(i);
            }
        }
        System.out.println(set3);
    }
}






