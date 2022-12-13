package Tasks;

import java.util.Objects;

public class Task6 extends java.util.Stack<java.lang.Integer>  {

//Организовать вычисления в виде стека.

    public void t9(String i){
        if (Objects.equals(i, "+")){
            int h = 0;
            for (int b : this){
            h+=b;
        }
        this.clear();
        this.add(h);
        }
        if (Objects.equals(i, "*")){
            int h = 1;
            for (int b : this){
                h*=b;
            }
            this.clear();
            this.add(h);
        }
    }
}
