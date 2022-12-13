package Tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {

//Ввести строки из файла, записать их в стек. Вывести строки в файл в обратном
//порядке
    public static void stack(String inputPath, String outputPath){
        Stack<String> stack = new Stack<>();
        try (Scanner scan = new Scanner(new File(inputPath));
             FileWriter writer = new FileWriter(outputPath)) {

            while (scan.hasNextLine()) {
                stack.push(scan.nextLine());
            }

            int len = stack.size();
            for (int i = 0; i < len; i++) {
                writer.write(stack.pop() + "\n");
            }
            System.out.println("Завершено успешно");
        }
        catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}


