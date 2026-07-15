import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        ArrayList<Student> studentList = new ArrayList<>();   
        LinkedList<Student> deansList = new LinkedList<>();  
        Stack<Student> historyStack = new Stack<>();          

        while (true) {
            System.out.println("\n--- STUDENT RECORD MANAGEMENT SYSTEM ---");
            System.out.println("1. Register New Student");
            System.out.println("2. View All Registered Students (ArrayList)");
            System.out.println("3. View Dean's List / Top Performers (LinkedList)");
            System.out.println("4. View Recently Added Student (Stack)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
           
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter GPA: ");
                double gpa = scanner.nextDouble();

                Student newStudent = new Student(id, name, gpa);

              
                studentList.add(newStudent);

          
                if (gpa >= 3.5) {
                    deansList.add(newStudent);
                }

               
                historyStack.push(newStudent);

                System.out.println("--- Student Registered Successfully! ---");

            } else if (choice == 2) {
               
                System.out.println("\n--- All Registered Students (ArrayList) ---");
                if (studentList.isEmpty()) {
                    System.out.println("No records found!");
                } else {
                    for (Student s : studentList) {
                        s.display();
                    }
                }

            } else if (choice == 3) {
               
                System.out.println("\n--- Dean's List (GPA >= 3.5) (LinkedList) ---");
                if (deansList.isEmpty()) {
                    System.out.println("No top performers yet!");
                } else {
                    for (Student s : deansList) {
                        s.display();
                    }
                }

            } else if (choice == 4) {
               
                System.out.println("\n--- Last Registered Student (Stack Peek) ---");
                if (historyStack.isEmpty()) {
                    System.out.println("No history found!");
                } else {
                  
                    historyStack.peek().display();
                }

            } else if (choice == 5) {
                System.out.println("Exiting System. Thank you!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}