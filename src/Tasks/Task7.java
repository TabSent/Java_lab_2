package Tasks;

import java.util.ArrayList;

public class Task7 {

//Выполнить попарное суммирование произвольного конечного ряда чисел
//следующим образом: на первом этапе суммируются попарно рядом стоящие числа,
//на втором этапе суммируются результаты первого этапа и т.д. до тех пор, пока не
//останется одно число

    public static void t7(int[] a){
        ArrayList<Integer> mass = new ArrayList<>();
        for (int j : a) {
            mass.add(j);
        }
        ArrayList<Integer> newMass= new ArrayList<>();
        while(mass.size()!=1) {
            for(int i=0;i<mass.size();i+=2){
                if(i==mass.size()-1) newMass.add(mass.get(i));
                else newMass.add(mass.get(i)+mass.get(i+1));
            }
            mass = new ArrayList<>(newMass);
            newMass.clear();
        }
        System.out.println("Res: " + mass.get(0));
    }
}
