package classes;

import java.io.Serializable;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String courseCode;
    private String courseTitle;

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                '}';
    }
}
