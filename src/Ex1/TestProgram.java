package Ex1;

import Ex1.Main.MyDate;
import Ex1.Main.Person;
import Ex1.Main.Student;
import Ex1.Main.Employee;
import Ex1.Main.FacultyMember;
import Ex1.Main.Staff;

public class TestProgram {
    public static void main(String[] args) {
        MyDate hireDate = new MyDate(15, 8, 2023);

        Person person = new Person("John Doe", "123 Elm Street", "555-1234", "john.doe@example.com");
        Student student = new Student("Alice Smith", "456 Oak Avenue", "555-5678", "alice.smith@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Bob Johnson", "789 Pine Road", "555-8765", "bob.johnson@example.com", "Office 101", 50000, hireDate);
        FacultyMember faculty = new FacultyMember("Dr. Emily Davis", "101 Maple Drive", "555-4321", "emily.davis@example.com", "Office 102", 60000, hireDate, "9am-5pm", "Professor");
        Staff staff = new Staff("Tom Brown", "202 Birch Lane", "555-3456", "tom.brown@example.com", "Office 103", 40000, hireDate, "Administrative Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
