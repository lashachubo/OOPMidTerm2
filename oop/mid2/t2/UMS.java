package oop.mid2.t2;

import java.util.ArrayList;
import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudentData(Student student) {
        System.out.println("Student: " + student.getName());
        System.out.println("Learning courses:");

        if (student.getName().equalsIgnoreCase("Lasha Chubinidze")) {
            Student you = getYourStudentData();
            for (LearningCourse course : you.getCourses()) {
                System.out.println("  - " + course);
            }
        } else {
            for (LearningCourse course : student.getCourses()) {
                System.out.println("  - " + course);
            }
        }
        System.out.println();
    }

    public Student getYourStudentData() {
        Student you = new Student("Lasha Chubinidze");

        you.addCourse(new LearningCourse("OOP", "None", "Computer Science"));
        you.addCourse(new LearningCourse("Computer organization", "None", "Computer Engineering"));
        you.addCourse(new LearningCourse("Algorithms", "Introduction To C", "Computer Science"));
        you.addCourse(new LearningCourse("Computers and Society", "None", "Computer Science"));

        return you;
    }

    public static void main(String[] args) {
        UMS ums = new UMS();

        Student student1 = new Student("Lasha Chubinidze");
        ums.addStudent(student1);

        Student student2 = new Student("Dato Chxeidze");
        student2.addCourse(new LearningCourse("Mathematics", "None", "Algebra, Calculus"));
        ums.addStudent(student2);

        Student student3 = new Student("LeBron James");
        student3.addCourse(new LearningCourse("Physics", "Mathematics", "Mechanics, Optics"));
        ums.addStudent(student3);

        ums.printStudentData(student1);
        ums.printStudentData(student2);
        ums.printStudentData(student3);
    }
}
