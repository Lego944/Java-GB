// Задание 1.
//Написать программу вычисления n-ого треугольного числа



public class Task1_HW {
  public static void main(String[] args) {
    try {
      int n = Library.getNumberByUser("Введите натуральное число N: ");
      if (n > 0) {
        int T = (n + 1) * n / 2;
    System.out.println("N-ное треугольное число: " + T);
      } 
      else {
        System.out.println("Число должно быть натуральным!");
      }
    } catch (Exception e) {
      System.out.println("Для вычислений необходимо ввести натуральное число!");
    }
  }
}