import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        
        double[] expenses = new double[100];
        int count = 0; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Expense Tracker!");

        while (true) {
           
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an expense");
            System.out.println("2. View all expenses");
            System.out.println("3. Calculate total expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); 

             if (choice == 1) { 
               
                System.out.print("Enter the amount of the expense: ");
                double expense = scanner.nextDouble();
                if (count < 100) {
                    expenses[count] = expense; 
                    count++;
                    System.out.println("Expense added!");
                } else {
                    System.out.println("Cannot add more expenses. Expense tracker is full.");
                }

            } else if (choice == 2) { 
               
                System.out.println("\nYour Expenses:");
                if (count == 0) { 
                    System.out.println("No expenses recorded.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". $" + expenses[i]);
                    }
                }

            } else if (choice == 3) { 
                
                double total = 0;
                for (int i = 0; i < count; i++) { 
                    total += expenses[i];
                }
                System.out.println("Total expenses: $" + total);

            } else if (choice == 4) { 
                
                System.out.println("Exiting. Goodbye!");
                break; 
            } else {
               
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); 
    }
}
