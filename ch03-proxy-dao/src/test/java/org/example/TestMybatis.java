package org.example;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.example.dao.StudentDao;
import org.example.daomain.Student;
import org.example.utils.MybatisUtils;
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
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudents();
        for(Student stu:students){
            System.out.println(stu);
        }

    }

    @Test
    public void testInsterStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1007);
        student.setName("aqz");
        student.setEmail("aqz@qq.com");
        student.setAge(25);
        int num = dao.insertStudents(student);
        sqlSession.commit();
        System.out.println("添加数量："+ num);
    }
}
