import java.util.*;
 
public class Library {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in); 

 /**
   * Метод принимает число от пользователя
   * 
   * @param text Сообщение для пользователя
   * @return Целое число
   */
  static int getNumberByUser(String text) {
    System.out.print(text);
    return input.nextInt();
  }
}
