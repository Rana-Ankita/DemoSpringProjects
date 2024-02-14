package com.springcore.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private Teacher teacher;

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void study(){
        this.teacher.display();
        System.out.println("All students are studying now");
    }
}
