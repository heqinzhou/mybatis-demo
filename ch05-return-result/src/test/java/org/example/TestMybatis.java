package org.example;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.example.dao.StudentDao;
import org.example.daomain.MyStudent;
import org.example.daomain.Student;
import org.example.utils.MybatisUtils;
import org.example.vo.QueryParam;
import org.example.vo.ViewStudent;
import org.junit.Test;

import java.util.List;
import java.util.Map;

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
    public void seleceStudentReturnViewStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        ViewStudent student = dao.seleceStudentReturnViewStudent(1002);
        System.out.println(student);
    }


    @Test
    public void countStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        int count = dao.countStudent();
        System.out.println(count);
    }


    @Test
    public void map(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<Object,Object> map = dao.selectMapById(1001);
        System.out.println(map);
    }
//===============================================

    @Test
    public void testselectAllStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectAllStudent();
        for(Student stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }

    @Test
    public void testselectMyStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> students = dao.selectMyStudent();
        for(MyStudent stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }


    @Test
    public void selectDiffColProperty(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> students = dao.selectDiffColProperty();
        for(MyStudent stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }



    @Test
    public void selectLikeOne(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        String name = "%A%";

        List<Student> students = dao.selectLikeOne(name);
        for(Student stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }


    @Test
    public void selectLikeTwo(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        String name = "A";
        List<Student> students = dao.selectLikeTwo(name);
        for(Student stu :students){
            System.out.println("学生=" + stu);
        }
        sqlSession.close();
    }

}
