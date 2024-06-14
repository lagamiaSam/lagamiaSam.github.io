package S3_JAVA;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sam", 20, "M", 3.75);
        Student student2 = new Student("Chloe", 19, "F", 3.00);
        Teacher teacher1 = new Teacher("Mr. Smith", 40, "M", 50000);

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Gender: " + student1.getGender());
        System.out.println("Grade: " + student1.getGrade());

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Gender: " + student2.getGender());
        System.out.println("Grade: " + student2.getGrade());

        System.out.println("\nTeacher 1:");
        System.out.println("Name: " + teacher1.getName());
        System.out.println("Age: " + teacher1.getAge());
        System.out.println("Gender: " + teacher1.getGender());
        System.out.println("Salary: " + teacher1.getSalary());
    }
}
