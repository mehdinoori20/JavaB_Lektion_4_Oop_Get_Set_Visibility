package com.Mehdi.demo;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}

