package S3_JAVA;

class Student extends Person {
    private double grade;

    public Student(String name, int age, String gender, double grade) {
        super(name, age, gender);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
