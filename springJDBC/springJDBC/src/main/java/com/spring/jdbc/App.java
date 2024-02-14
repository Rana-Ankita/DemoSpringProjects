package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started.........." );
        //not recommended way
       /* ApplicationContext context = new ClassPathXmlApplicationContext("springjdbcConfig.xml");
        JdbcTemplate template = context.getBean("jdbctemplate", JdbcTemplate.class);
        //insert query
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        //fire the query
        int result = template.update(query, 9, "Ankit", "Dehradun");
        System.out.println("No. of record inserted"  +result);*/

        //when we used XML file
       // ApplicationContext context = new ClassPathXmlApplicationContext("springjdbcConfig.xml");
        //when we used annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
        //INSERT the data
        /*Student student = new Student();
        student.setId(2);
        student.setName("Siddharth");
        student.setCity("Chamba");
        int result=studentDao.insert(student);
        System.out.println("No. of record inserted"  +result);*/

        //UPDATE the data
        /*Student student = new Student();
        student.setId(9);
        student.setName("Ankit Kaintura");
        student.setCity("Pune");
        int result=studentDao.change(student);
        System.out.println("No. of data row changed" +result);*/

        //DELETE the data
       /* int result = studentDao.delete(4);
        System.out.println("No. of deleted data" +result);*/

        //SELECT student record
        /*Student student = studentDao.getStudent(9);
        System.out.println("Student Record......" +student);*/

        //SELECT all Students data
        List<Student> students = studentDao.getAllStudents();
        for (Student student: students) {
            System.out.println("Student....." +student);
        }
    }
}
