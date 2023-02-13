// Задача 4.
// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//  который запишет эту строку в простой текстовый файл, обработайте исключения.

package Seminar2;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {

    // Способ решения самостоятельный.

    //     String line = "TEST ";
    //     int count = 100;
        
    //     String resultLine = repeatString(line, count);
    //     fillFile("file.txt", resultLine);
    // }

    // public static void fillFile(String fileName, String line) {
    //     FileWriter fileWriter = null;
    //     try {
    //         File file = new File(fileName);

    //         if (file.createNewFile()) {
    //             System.out.println("file.created");
    //         }
    //         else {
    //             System.out.println("file.existed");
    //             fileWriter = new FileWriter(file);
    //             fileWriter.append(line);
    //             fileWriter.close();
    //         }
    //     } catch (Exception e) {
    //     } finally {
    //         try {
    //             if (fileWriter != null) {
    //             fileWriter.close();
    //         }
    //         } catch(IOException e) {
    //             System.out.println("Не удалось закрыть файл!");
    //         }
            
    //     }
    // }
    // public static String repeatString(String text, int count) {
    //     StringBuilder result = new StringBuilder();
    //     for (int i = 0; i < count; i++) {
    //         result.append(text);
    //     }
    //     return result.toString();
    // }

    // Сокращенный способ решения задачи.
    try (FileWriter fileWriter = new FileWriter ("file.txt")) {
        fileWriter.append("TEST ".repeat (100));
        }
        catch (IOException ex) {
        System.out.println("Не удалось открыть файл");
        }
    }
}