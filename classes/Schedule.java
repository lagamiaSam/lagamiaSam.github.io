package classes;

import java.io.Serializable;

public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Course course;
    private int units;
    private int yearLevel;
    private String section;
    private String day;
    private String time;
    private String room;

    public Schedule(Course course, int units, int yearLevel, String section, String day, String time, String room) {
        this.course = course;
        this.units = units;
        this.yearLevel = yearLevel;
        this.section = section;
        this.day = day;
        this.time = time;
        this.room = room;
    }

    public Course getCourse() {
        return course;
    }

    public int getUnits() {
        return units;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getSection() {
        return section;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }

    // Method to convert Schedule to a string suitable for file storage
    public String toFileString() {
        return course.getCourseCode() + "," +
               course.getCourseTitle() + "," +
               units + "," +
               yearLevel + "," +
               section + "," +
               day + "," +
               time + "," +
               room;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "course=" + course +
                ", units=" + units +
                ", yearLevel=" + yearLevel +
                ", section='" + section + '\'' +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
