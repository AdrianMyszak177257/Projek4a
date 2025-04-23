import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

      while (true) {
        System.out.println("Dodaj studenta");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
          System.out.print("Podaj imię studenta: ");
          String name = scanner.nextLine();

          System.out.print("Podaj wiek studenta: ");
          int age = scanner.nextInt();
          scanner.nextLine(); 

          s.addStudent(new Student(name, age));
          System.out.println("Student dodany!");
        } else if (choice == 2) {
          var students = s.getStudents();
          System.out.println("\nLista studentów:");
          for (Student current : students) {
            System.out.println(current.ToString());
          }
        } else if (choice == 3) {
          break;
        }
      }

      scanner.close();

    } catch (IOException e) {
      System.out.println("Błąd: " + e.getMessage());
    }
  }
}