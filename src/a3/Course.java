package a3;

import java.util.List;

public class Course {
    private String courseName;
    private int numberOfStudent;
    private boolean full;
    private Student [] registeredStudent;//?

    public Student[] getStudents(){
        return this.registeredStudent;
    }

    public String getName() {
        return courseName;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

}
