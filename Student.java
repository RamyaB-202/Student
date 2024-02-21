import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name; // Student name
    private LocalDate dob; // Student date of birth

    // Constructor
    public Student(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob); // Parse the date string
    }

    // Display student name
    public void displayStudentName() {
        System.out.println("Student name: " + name);
    }

    // Display age of student
    public void displayAge() {
        LocalDate today = LocalDate.now(); // Get current date
        Period age = Period.between(dob, today); // Calculate age
        System.out.println("Student age: " + age.getYears() + " years");
    }
    
        public static void main(String[] args) {
            // Create a student object with name and date of birth
            Student s1 = new Student("Ramya", "2004-04-26");
            // Display student name and age
            s1.displayStudentName();
            s1.displayAge();
        } 
}
