package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("studentDao")
public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    //Save Student data(create operation)
    @Transactional(readOnly = false)
    public int insert(Student student) {
        Integer result=(Integer) hibernateTemplate.save(student);
        return result;
    }

    //get the single student data(Read operation)
    public Student getStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        return student;
    }

    //get all students data
    public List<Student> getAllStudents(){
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }

    //Delete the record
    @Transactional
    public void deleteStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        this.hibernateTemplate.delete(student);
    }

    //update the record
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
