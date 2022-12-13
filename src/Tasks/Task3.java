package Tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {

//Сложить два многочлена заданной степени, если коэффициенты многочленов
//хранятся в объекте HashMap

    public static void t3(){
         HashMap<Integer, String> map1 = new HashMap<>();
         HashMap<Integer, String> map2 = new HashMap<>();
         HashMap<Integer, String> map3 = new HashMap<>();
         System.out.println("Задайте степень многочленов n = ");
         Scanner n = new Scanner(System.in);
         int f = n.nextInt();
         int f2 = f;
         int f3 = f;
         String qq;
         String qq2;
         int v;
         int k;
         for (int i = f; f >= 0; f--){
            v = (int)((Math.random())*100+1);
            k =(int)((Math.random())*100+1);
            qq = v +"x^" + f;
            qq2 = k + "x^" +f;
            map1.put(f,qq);
            map2.put(f,qq2);
         }
         for (int g =f2;f2>=0; f2--){
            String qw = map1.get(f2).substring(0, map1.get(f2).length() - 3);
            String qw2 = map2.get(f2).substring(0, map2.get(f2).length() - 3);
            v = Integer.parseInt(qw) + Integer.parseInt(qw2);
            qq = v +"x^" + f2;
            map3.put(f2,qq);
         }
         System.out.print("y = ");
         for (int i = f3; i>=0; i--){
            if (i==0){
                String qw = map1.get(i).substring(0, map1.get(i).length() - 3);
                System.out.print(qw);
            }
            else {
                System.out.print(map1.get(i) + " + ");
            }
         }
         System.out.println();
         System.out.println("+");
         System.out.print("y = ");
         for (int i = f3; i>=0; i--){
             if (i==0){
                String qw = map2.get(i).substring(0, map2.get(i).length() - 3);
                System.out.print(qw);
             }
             else {
                System.out.print(map2.get(i) + " + ");
             }
         }
         System.out.println();
         System.out.println("=");
         System.out.print("y = ");
         for (int i = f3; i>=0; i--){
            if (i==0){
                String qw = map3.get(i).substring(0, map3.get(i).length() - 3);
                 System.out.print(qw);
             }
            else {
                System.out.print(map3.get(i) + " + ");
            }
         }
     }
}
