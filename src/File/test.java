//package File;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class test {
//    public static Scanner scan = new Scanner(System.in);
//
//    static class Employee {
//        // Variables
//        String userName, userGender = "";
//        int userID, userSalary = 0;
//
//        // Constructor
//        Employee(String userName, String userGender, int userID, int userSalary) {
//            this.userName = userName;
//            this.userGender = userGender;
//            this.userID = userID;
//            this.userSalary = userSalary;
//        }
//
//        // Method to read employee data
//        void readEmployee() {
//            System.out.println("==================================================");
//            System.out.print("Enter your id: ");
//            userID = scan.nextInt();
//            scan.nextLine();
//            System.out.print("Enter your username: ");
//            userName = scan.nextLine();
//            System.out.print("Enter your gender: ");
//            userGender = scan.nextLine();
//            System.out.print("Enter your salary: ");
//            userSalary = scan.nextInt();
//            scan.nextLine();
//            System.out.println("hello " + userName + ", Sex: " + userGender + ", N.O: " + userID + ", Salary: " + userSalary + "$");
//            System.out.println("==================================================");
//        }
//
//        // Method to add employee to file
//        void addEmployee() {
//            try {
//                FileWriter writer = new FileWriter("Employee.txt", true);
//                writer.write(userID + "," + userName + "," + userGender + "," + userSalary + "\n");
//                writer.close();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//        // Method to delete employee from file by id
//        void deleteEmployee(int id) {
//            File inputFile = new File("Employee.txt");
//            File tempFile = new File("Employee_temp.txt");
//
//            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//                 BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] data = line.split(",");
//                    if (Integer.parseInt(data[0]) != id) {
//                        writer.write(line);
//                        writer.newLine();
//                    }
//                }
//            } catch (IOException e) {
//                System.out.println("Error processing file: " + e.getMessage());
//            }
//
//            if (!inputFile.delete()) {
//                System.out.println("Could not delete original file");
//            }
//
//            if (!tempFile.renameTo(inputFile)) {
//                System.out.println("Could not rename temporary file");
//            }
//        }
//
//        // Method to search for an employee by id
//        Employee searchEmployee(int id) {
//            try (BufferedReader reader = new BufferedReader(new FileReader("Employee.txt"))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] data = line.split(",");
//                    if (Integer.parseInt(data[0]) == id) {
//                        return new Employee(data[1], data[2], Integer.parseInt(data[0]), Integer.parseInt(data[3]));
//                    }
//                }
//            } catch (IOException e) {
//                System.out.println("Error reading from file: " + e.getMessage());
//            }
//            return null;
//        }
//
//        // Method to display all employees
//        void displayAllEmployees() {
//            try (BufferedReader reader = new BufferedReader(new FileReader("Employee.txt"))) {
//                String line;
//                System.out.println("----------------------------------------------------");
//                System.out.println("ID\tName\tGender\tSalary");
//                System.out.println("----------------------------------------------------");
//                while ((line = reader.readLine()) != null) {
//                    String[] data = line.split(",");
//                    System.out.println(data[0] + "\t" + data[1] + "\t" + data[2] + "\t" + data[3]);
//                }
//                System.out.println("----------------------------------------------------");
//            } catch (IOException e) {
//                System.out.println("Error reading from file: " + e.getMessage());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Employee object = new Employee("", "", 0, 0);
//        File file = new File("Employee.txt");
//        if (!file.exists() || file.length() == 0) {
//            // Initializing three employees if the file is new or empty
//            Employee e1 = new Employee("Lucy", "F", 1, 300);
//            Employee e2 = new Employee("Jhon", "M", 2, 400);
//            Employee e3 = new Employee("Alex", "M", 3, 500);
//
//            e1.addEmployee();
//            e2.addEmployee();
//            e3.addEmployee();
//        }
//        boolean condition = true;
//        String userInput = "";
//        do {
//            System.out.println("\na. Add new Employee");
//            System.out.println("b. Delete Employee by id");
//            System.out.println("c. Search Employee by id");
//            System.out.println("d. Display all Employees");
//            System.out.println("e. Exit the program");
//            System.out.print("Enter your choice: ");
//            userInput = scan.nextLine();
//            switch (userInput.toLowerCase()) {
//                case "a":
//                    object.readEmployee();
//                    object.addEmployee();
//                    break;
//                case "b":
//                    System.out.print("Enter the ID of the employee to delete: ");
//                    int deleteId = scan.nextInt();
//                    scan.nextLine();
//                    object.deleteEmployee(deleteId);
//                    break;
//                case "c":
//                    System.out.print("Enter the ID of the employee to search: ");
//                    int searchId = scan.nextInt();
//                    scan.nextLine();
//                    Employee foundEmployee = object.searchEmployee(searchId);
//                    if (foundEmployee != null) {
//                        System.out.println("Employee found: ID = " + foundEmployee.userID + ", Name = " + foundEmployee.userName + ", Gender = " + foundEmployee.userGender + ", Salary = " + foundEmployee.userSalary);
//                    } else {
//                        System.out.println("Search Not Found");
//                    }
//                    break;
//                case "d":
//                    object.displayAllEmployees();
//                    break;
//                case "e":
//                    condition = false;
//                    break;
//                default:
//                    System.out.println("Invalid option. Please try again.");
//            }
//        } while (condition);
//
//        System.out.println("Goodbye!");
//    }
//}
