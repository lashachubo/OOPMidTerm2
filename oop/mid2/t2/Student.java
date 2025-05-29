package oop.mid2.t2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<LearningCourse> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LearningCourse> getCourses() {
        return courses;
    }

    public void setCourses(List<LearningCourse> courses) {
        this.courses = courses;
    }

    public void addCourse(LearningCourse course) {
        courses.add(course);
    }
}
