import java.io.IOException;
import java.util.Vector;

/*public class Main {
    public static void main(String[] args) {
        Start st = new Start();
        st.T11();
    }
}*/

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vecr = new Vector();
        double[] mass = new double[args.length];
        for (int i = 0; i < args.length;i++){
            mass[i] = Double.parseDouble(args[i]);

        }
        DoubleVector vectt = new DoubleVector();
        for (double v : mass) {
            vectt.add(v);
        }
        System.out.print("Vector: ");
        for (Object i: vectt){

            System.out.print((double) i + " ");
        }
    }
}




