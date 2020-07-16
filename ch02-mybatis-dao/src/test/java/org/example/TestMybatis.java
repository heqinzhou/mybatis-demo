package org.example;

import org.example.dao.Impl.StudentDaoImpl;
import org.example.dao.StudentDao;
import org.example.daomain.Student;
import org.junit.Test;

import java.util.List;

/**
 * @PACKAGE_NAME: org.example
 * @NAME: TestMybatis
 * @date: 2020/7/11 10:59 周六
 * @author: heqinz
 */
public class TestMybatis {

    @Test
    public void testSelectStudent(){
        StudentDao dao = new StudentDaoImpl();
        List<Student> studentList = dao.selectStudents();
        for(Student stu : studentList){
            System.out.println(stu);
        }
    }

    @Test
    public void testInsterStudent(){
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(1006);
        student.setName("t2323");
        student.setEmail("tt23tt@qq.com");
        student.setAge(25);
        int num = dao.insertStudent(student);
        System.out.println("添加数量："+ num);
    }
}
