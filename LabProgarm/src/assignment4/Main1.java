package assignment4;
class Student {
    
    String name;
    int age;
    String department;

    
    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}

public class Main1 {

	public static void main(String[] args) {
		
		Student student1 = new Student(); // Default constructor
        Student student2 = new Student("John", 22); // Constructor with name and age parameters
        Student student3 = new Student("Alice", 25, "Computer Science"); // Constructor with name, age, and department parameters

       
        System.out.println("Student 1 details: Name - " + student1.name + ", Age - " + student1.age + ", Department - " + student1.department);
        System.out.println("Student 2 details: Name - " + student2.name + ", Age - " + student2.age + ", Department - " + student2.department);
        System.out.println("Student 3 details: Name - " + student3.name + ", Age - " + student3.age + ", Department - " + student3.department);
		

	}

}
