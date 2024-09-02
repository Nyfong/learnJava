package Ex1;
public class Main {

    // MyDate class
    public static class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }


        public String toString() {
            return String.format("%02d/%02d/%d", day, month, year);
        }
    }

    // Person class
    public static class Person {
        private String name;
        private String address;
        private String phoneNumber;
        private String email;

        public Person(String name, String address, String phoneNumber, String email) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Person: " + name;
        }

        // Getters
        public String getName() { return name; }
        public String getAddress() { return address; }
        public String getPhoneNumber() { return phoneNumber; }
        public String getEmail() { return email; }
    }

    // Student class
    public static class Student extends Person {
        public static final String FRESHMAN = "Freshman";
        public static final String SOPHOMORE = "Sophomore";
        public static final String JUNIOR = "Junior";
        public static final String SENIOR = "Senior";

        private String classStatus;

        public Student(String name, String address, String phoneNumber, String email, String classStatus) {
            super(name, address, phoneNumber, email);
            this.classStatus = classStatus;
        }

        @Override
        public String toString() {
            return "Student: " + getName();
        }

        // Getter
        public String getClassStatus() { return classStatus; }
    }

    // Employee class
    public static class Employee extends Person {
        private String office;
        private double salary;
        private MyDate dateHired;

        public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
            super(name, address, phoneNumber, email);
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
        }

        @Override
        public String toString() {
            return "Employee: " + getName();
        }

        // Getters
        public String getOffice() { return office; }
        public double getSalary() { return salary; }
        public MyDate getDateHired() { return dateHired; }
    }

    // FacultyMember class
    public static class FacultyMember extends Employee {
        private String officeHours;
        private String position;

        public FacultyMember(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String position) {
            super(name, address, phoneNumber, email, office, salary, dateHired);
            this.officeHours = officeHours;
            this.position = position;
        }

        @Override
        public String toString() {
            return "FacultyMember: " + getName();
        }

        // Getters
        public String getOfficeHours() { return officeHours; }
        public String getPosition() { return position; }
    }

    // Staff class
    public static class Staff extends Employee {
        private String title;

        public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
            super(name, address, phoneNumber, email, office, salary, dateHired);
            this.title = title;
        }

        @Override
        public String toString() {
            return "Staff: " + getName();
        }

        // Getter
        public String getTitle() { return title; }
    }
}

