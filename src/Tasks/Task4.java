package Tasks;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Stack;

public class Task4 {

//Создать стек из элементов каталога.

    public static void t4()throws IOException {
        Stack<File> file = new Stack<>();
        File path = new File("C:\\Users\\vladb/Desktop");
        for (File i : Objects.requireNonNull(path.listFiles())) {
            file.add(i.getCanonicalFile());
        }
        for (File i : file) {
            System.out.println(i);
        }
    }
}
