package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // ApplicationContext context=new ClassPathXmlApplicationContext("springORMConfig.xml");
       /* ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
        Student student=new Student(124,"Ankita Rana","Pune");
        int result=studentDao.insert(student);
        System.out.println( "No. of Record inserted..." +result );*/

        //Menu driven project
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go =true;
        while (go) {
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display all students");
            System.out.println("PRESS 3 for display single student");
            System.out.println("PRESS 4 for delete student");
            // System.out.println("PRESS 5 for update student");
            System.out.println("PRESS 6 for exit");

            try{
                int input = Integer.parseInt(br.readLine());
                switch (input){
                    case 1:
                        //add new student
                        System.out.println("Enter user id:");
                        int uId = Integer.parseInt(br.readLine());
                        System.out.println("Enter user Name");
                        String uName = br.readLine();
                        System.out.println("Enter User City");
                        String uCity= br.readLine();
                        //Student student = new Student(uId, uName, uCity);
                        //creating student object and setting values
                        Student student = new Student();
                        student.setStudentId(uId);
                        student.setStudentName(uName);
                        student.setStudentCity(uCity);
                        //saving student object to database by calling insert of studentDao
                        int result = studentDao.insert(student);
                        System.out.println("No. of Student added : "+result);
                        System.out.println("**************************************");
                        break;
                    case 2:
                        //display all students
                        List<Student> allStudent = studentDao.getAllStudents();
                        for (Student s:allStudent) {
                            System.out.println("Student Id :" +s.getStudentId());
                            System.out.println("Student Name :" +s.getStudentName());
                            System.out.println("Student City :" +s.getStudentCity());
                        }
                        System.out.println("****************************");
                        break;
                    case 3:
                        //display single student
                        System.out.println("Enter user id");
                        int id = Integer.parseInt(br.readLine());
                       Student s1 = studentDao.getStudent(id);
                        System.out.println("Student_Id :" +s1.getStudentId());
                        System.out.println("Student_Name :" +s1.getStudentName());
                        System.out.println("Student_City :" +s1.getStudentCity());
                        System.out.println("***************************************");
                        break;
                    case 4:
                        //delete student
                        System.out.println("Enter student id :");
                        int userId = Integer.parseInt(br.readLine());
                        studentDao.deleteStudent(userId);
                        System.out.println("Student deleted.............");
                        break;
                   /* case 5:
                        //Update student data
                        System.out.println("Enter user id:");
                        int uId1 = Integer.parseInt(br.readLine());
                        System.out.println("Enter user Name");
                        String uName1 = br.readLine();
                        System.out.println("Enter User City");
                        String uCity1= br.readLine();
                        //Student student = new Student(uId, uName, uCity);
                        //creating student object and setting values
                        Student student1 = new Student();
                        student1.setStudentId(uId1);
                        student1.setStudentName(uName1);
                        //saving student object to database by calling insert of studentDao
                        studentDao.updateStudent(student1);
                        System.out.println("Student Record is updated");
                        System.out.println("**************************************");
                        break;*/

                    case 6:
                        //exit
                        go=false;
                        break;


                }
            }
            catch (Exception e){
                System.out.println("Invalid input!! please try with another one");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("thanks for using this application");
        System.out.println("See you soon!!");

    }
}
