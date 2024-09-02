package OOP;
/* Create a Student class that encapsulates all the data and behavior necessary to manage a student’s
academic record.*/
public class Student {
    /*he class should have
    private variables for the
     student’s name,
     ID,
     courses taken,
     and grades.*/
    private String name;
    private String studentId;
    private String[] courses;  // Array to store the names of courses taken
    private double[] grades;   // Array to store the grades for the courses
    private int courseCount;   // Counter to keep track of the number of courses added
    /*It should also have methods for
     adding and dropping courses, as well as calculating the
    student’s total score.*/
    // Constructor to initialize the student's name, ID, and arrays for courses and grades
    public Student(String name, String studentId, int maxCourses) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new String[maxCourses];
        this.grades = new double[maxCourses];
        this.courseCount = 0;
    }
    // Getter for the student's name
    public String getName() {
        return name;
    }

    // Getter for the student's ID
    public String getStudentId() {
        return studentId;
    }

    // Method to add a course with its grade
    public void addCourse(String course, double grade) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            grades[courseCount] = grade;
            courseCount++;
        } else {
            System.out.println("Cannot add more courses. Maximum limit reached.");
        }
    }

    // Method to drop a course
    public void dropCourse(String course) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(course)) {
                // Shift elements to the left to remove the course
                for (int j = i; j < courseCount - 1; j++) {
                    courses[j] = courses[j + 1];
                    grades[j] = grades[j + 1];
                }
                courses[courseCount - 1] = null;  // Clear the last element
                grades[courseCount - 1] = 0;  // Reset the grade
                courseCount--;
                return;
            }
        }
        System.out.println("Course not found.");
    }

    // Method to calculate the total score (sum of all grades)
    public double calculateTotalScore() {
        double totalScore = 0;
        for (int i = 0; i < courseCount; i++) {
            totalScore += grades[i];
        }
        return totalScore;
    }


    // Method to display all courses with their grades
    public void displayCourses() {
        System.out.println("Courses and Grades:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    // Main
    public static void main(String[] args) {
        Student student = new Student("Alice Smith", "S12345", 5);

        // Adding courses
        student.addCourse("Math", 95);
        student.addCourse("Science", 85);
        student.addCourse("English", 78);

        // Displaying courses
        System.out.println("===================================");
        System.out.println("+Displaying courses");
        student.displayCourses();
        double totalScore = student.calculateTotalScore();
        System.out.println("Total Score: " + totalScore);

        // Dropping a course
        System.out.println("===================================");
        String droppingCoruse = "Science";
        System.out.println("+Dropping a course ["+droppingCoruse+"]");
        student.dropCourse(droppingCoruse);

        // Displaying courses after dropping one
        System.out.println("===================================");
        System.out.println("+Displaying courses after dropping one");
        student.displayCourses();
        System.out.println("===================================");
        // Calculating total score

        System.out.println("Total Score: " + totalScore);
    }
}
