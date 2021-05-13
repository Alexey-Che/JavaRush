package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String name;
    public int age;
    private List<Student> students;

    public University(String name, int  age) {
        this.name = name;
        this.age = age;
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double value) {
        //TODO:
        for (Student student: students) {
            if (student.getAverageGrade() == value) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        if (students.size() > 0 ) {
            Student maxStudent = students.get(0);
            double maxAverageGrade = maxStudent.getAverageGrade();
            for (Student student: students) {
                if (student.getAverageGrade() > maxAverageGrade) {
                    maxStudent = student;
                    maxAverageGrade = student.getAverageGrade();
                }
            }
            return maxStudent;
        }
        return null;
    }

    public void expel(Student student) {
        students.remove(student);

    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        if (students.size() > 0 ) {
            Student minStudent = students.get(0);
            double minAverageGrade = minStudent.getAverageGrade();
            for (Student student: students) {
                if (student.getAverageGrade() <minAverageGrade) {
                    minStudent = student;
                    minAverageGrade = student.getAverageGrade();
                }
            }
            return minStudent;
        }
        return null;
    }
}