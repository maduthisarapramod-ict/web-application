import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Student Registration ---");
        
      
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();


        Student s1 = new Student(id, name, gpa);

     
        System.out.println("\n--- Saved Student Details ---");
        s1.display();

        scanner.close();
    }
}