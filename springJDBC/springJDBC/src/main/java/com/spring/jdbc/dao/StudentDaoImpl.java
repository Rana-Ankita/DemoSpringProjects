package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

    //@Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public int change(Student student) {
        //update data
        String query = "update student set name=?, city=? where id=?";
        int result=this.jdbcTemplate.update(query,student.getName(), student.getCity(), student.getId());
        return result;
    }

    @Override
    public int delete(int studentID) {
        //Delete data
        String query ="Delete from student where id=?";
        int result= this.jdbcTemplate.update(query, studentID);
        return result;
    }

    @Override
    public Student getStudent(int studentId) {
        // Select (fetch) one Student record
        String query=" select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student=this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        //if we don't want to create RowMapperImpl class then we can use anonymous class **comment the RowMapper
        //line
        /*Student student=this.jdbcTemplate.queryForObject(query, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setCity(rs.getString(3));
                return student;
            }
        }, studentId);*/
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        //Select all student data
        String query = "Select * from student";
        List<Student> students= this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
