//package File;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.util.Scanner;
//
//
//public class Ex9 {
//    public  static Scanner scan = new Scanner(System.in);
//
//    static class Employee {
//        //variables
//        String userName, userGender ="";
//        int userID , userSalary =0;
//      //no aug construct
//      Employee(String userName, String userGender, int userID, int userSalary){
//        this.userName = userName;
//        this.userGender = userGender;
//        this.userID = userID;
//        this.userSalary = userSalary;
//      }
//      //o readEmployee() that asks the user to enter id, name, gender and salary of an employee.
//      void readEmployee()
//      {
//          System.out.println("==================================================");
//          System.out.print("Enter your id:");
//          userID = scan.nextInt(); scan.nextLine();
//          System.out.print("Enter your username:");
//          userName = scan.nextLine();
//          System.out.print("Enter your gender:");
//          userGender = scan.nextLine();
//          System.out.print("Enter your salary:");
//          userSalary  = scan.nextInt(); scan.nextLine();
//          System.out.println("hello "+ userName +", Sex:" +userGender +", N.O:" + userID + ", Salary:" +userSalary+"$");
//          System.out.println("==================================================");
//
//      }
//      // o addEmployee() that save the employee data into Employee.txt file.
//      void addEmployee()
//      {
////        File file = new File("Employee.txt");
//          try {
//              // Create a Writer that is linked with the myFile.txt
//              FileWriter writer = new FileWriter("Employee.txt", true);
//              // app the data to the file
//              writer.write("\n");
//              writer.write(String.valueOf(userID));
//              writer.write(","+userName);
//              writer.write(","+userGender);
//              writer.write(String.valueOf(","+userSalary));
//
//              // Closes the writer
//              writer.close();
//          }
//          catch (Exception e) {
//              System.out.println(e);
//          }
//      }
//      //  o deleteEmployee() that removes the employee data from Employee
//        void removeEmployee()
//        {
//
//        }
//
//    };
//    public static void main(String[] args)
//    {
//
//        //test
//        Employee object = new Employee("Nyfong","M",0,0);
//        boolean condition = true;
//        String userInput="";
//        do {
//            System.out.println("\na. Add new Employee");
//            System.out.println("b. Delete  Employee by id");
//            System.out.println("c. Search  Employee by id");
//            System.out.println("d. Display  all Employee");
//            System.out.println("e. Exit the program");
//            System.out.print("Enter your choice: ");
//            userInput = scan.nextLine();
//            if( userInput.equalsIgnoreCase("e") )
//            {
//                condition = false;
//            }
//            switch (userInput)
//            {
//                case "a":
//                case "A":{
//
//                    object.readEmployee();
//                    object.addEmployee();
//                    break;
//                }
//                default:  System.out.println("The input is neither 'a' nor 'b'");
//            }
//
//
//
//        }while ( condition);
//
//
//
//
//
//
//
//
//        System.out.println("hello");
//    }
//
//}
