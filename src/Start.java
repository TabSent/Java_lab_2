import Tasks.*;

import java.io.IOException;

public class Start {

    public void T1(){
        Task1.stack("C:\\Users\\vladb\\Desktop/input.txt", "C:\\Users\\vladb\\Desktop/output.txt");
    }

    public void T2(){
        Task2.startStack(123456);
    }

    public void T3(){
        Task3.t3();
    }

    public void T4() throws IOException {
        Task4.t4();
    }

    public void T5(){
        Task5.std();
    }

    public void T6(){
    }

    public void T7(int[] y){
        int[] mass = {2,2,2,2,2};
        Task7.t7(y);
    }

    public void T8(){
        Task8.t8();
    }

    public void T9(){
        Task9 task = new Task9();
        task.stack();
    }

    public void T10(){
        Task10 task = new Task10();
        task.t10();
    }

    public void T11(){
        int[] a = {1,2,3,4,9};
        int[] b = {38,43,4,2,490};
        Task11 task11 = new Task11();
        task11.t11(a, b);

    }

    public void T12(){

    }

    public void T13(){
        Task13.t13();
    }
}
