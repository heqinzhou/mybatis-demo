package org.example;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.example.dao.StudentDao;
import org.example.daomain.Student;
import org.example.utils.MybatisUtils;
import org.example.vo.QueryParam;
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
    public void testSelectStudentselectbyId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudentById(1002);
        System.out.println(student);
    }

    @Test
    public void selectMulitParam(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectMulitParam("Ares",20);
        for(Student stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }

    @Test
    public void selectMulitObject(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        QueryParam param = new QueryParam();
        param.setParamName("Ares");
        param.setParamAge(20);
        List<Student> students = dao.selectMulitObject(param);
        for(Student stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }

    @Test
    public void selectMulitStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("Ares");
        student.setAge(20);

        List<Student> students = dao.selectMulitStudent(student);
        for(Student stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }
}
