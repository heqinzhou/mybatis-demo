package org.example;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;

import org.example.dao.StudentDao;
import org.example.daomain.Student;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @PACKAGE_NAME: org.example
 * @NAME: TestMybatis
 * @date: 2020/7/11 10:59 周六
 * @author: heqinz
 */
public class TestMybatis {

    @Test
    public void selectStudentIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("Ares");
        student.setAge(25);
        List<Student> students = dao.selectStudentIf(student);

        for(Student stu : students){
            System.out.println(stu);
        }
    }


    @Test
    public void testForeach(){
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        //String sql = "selece * from student where id in (1001,1002,1003)";
        String sql = "selece * from student where id in";
        StringBuilder builder  = new StringBuilder("");
        int init = 0;
        int len = list.size();
        builder.append("(");
        for(Integer i:list){
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append(")");
        sql = sql + builder.toString();
        System.out.println(sql);
    }


    @Test
    public void selectStudentForOne(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        List<Student> students = dao.selectStudentForOne(list);
        for(Student stu : students){
            System.out.println(stu);
        }
    }

    @Test
    public void selectStudentForTwo(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> stulist = new ArrayList<>();
       Student ss1 = new Student();
       ss1.setId(1002);
       stulist.add(ss1);
       ss1 = new Student();
       ss1.setId(1005);
        stulist.add(ss1);

        List<Student> students = dao.selectStudentForTwo(stulist);
        for(Student stu : students){
            System.out.println(stu);
        }
    }


    @Test
    public void seleceAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        PageHelper.startPage(1,3);
        List<Student> students = dao.seleceAll();
        for(Student stu : students){
            System.out.println(stu);
        }
    }
}
