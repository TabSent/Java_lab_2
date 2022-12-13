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

    public void T7(){
        int[] mass = {2,2,2,2,2};
        Task7.t7(mass);
    }

    public void T8(){
        Task8.t8();
    }

    public void T9(){
        Task9 task = new Task9();
        task.stack();
    }

    public void T10(){

    }

    public void T11(){

    }

    public void T12(){

    }

    public void T13(){

    }
}
