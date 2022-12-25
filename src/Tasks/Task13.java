package Tasks;

import java.util.Stack;

public class Task13 {

    //Списки (стеки) I(1..N) и U(1..N) содержат результаты N измерений тока и
    //напряжения на неизвестном сопротивлении R. Найти приближѐнное число R
    //методом наименьших квадратов

    public static void t13() {
        Stack<Double> stack_I = new Stack<>();
        Stack<Double> stack_U = new Stack<>();
        double Isum = 0;
        double Usum = 0;
        double R;
        stack_I.push(3.33);
        stack_I.push(8.23);
        stack_I.push(7.33);

        stack_U.push(99.4);
        stack_U.push(101.4);
        stack_U.push(100.4);

        while (!stack_U.isEmpty() && !stack_I.isEmpty()){
            double IVal = stack_I.pop();
            Isum += IVal * IVal;
            Usum += IVal * stack_U.pop();
        }

        R = Usum/Isum;
        System.out.println(R);
    }
}
