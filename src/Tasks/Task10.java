package Tasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Task10 extends Stack<Integer> {
    //Умножить два многочлена заданной степени, если коэффициенты многочленов
    //хранятся в списках.

    Task10 previos = null;
    public void t10(){

    Task10 link = null;
        Task10 li = null;
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        Scanner q = new Scanner(System.in);
        System.out.println("Введите степень многочленов");
        System.out.println();
        int b = q.nextInt();
        for (int i = 0; i <= b; i++) {

            String h = String.valueOf((int) ((Math.random() + 0.1) * 10));
            l1.add(h);
            h = String.valueOf((int) ((Math.random() + 0.1) * 10));
            l2.add(h);

            int t = Integer.parseInt(l1.get(i).toString());
            int t2 = Integer.parseInt(l2.get(i).toString());
        }
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("---------------");
        for (int i = b * 2; i >= 0; i--) {
            int p = i;
            Task10 w = new Task10();
            li = w;
            for (int k = 0; k <= b; k++) {
                for (int g = 0; g <= b; g++) {
                    if (k + g == i) {

                        w.add(k);
                        w.add(g);
                    }
                }
            }
            if (link != null) {
                w.previos = link;
            }
            link = w;
        }
        for (int h = 0; h<=b*2; h++){
            if (link==null)break;
            int count = 0;
            int step = b*2;
            while(link.size()!=0){
                int z = Integer.parseInt(l1.get(link.pop()).toString());
                int z2 = Integer.parseInt(l2.get(link.pop()).toString());
                int z3 = z*z2;
                count+=z3;
                if (link.size()==0){
                    if (step==0){
                        System.out.println(count);
                    }
                    else {
                        System.out.print(count + "x^" + step + " + ");
                    }
                    step--;
                    count = 0;
                    link=link.previos;
                }

                if (link==null) {break;}
            }
        }
    }
}



/*public class Arrayss extends Stack<Integer> {
    Arrayss previos =null;
}*/



