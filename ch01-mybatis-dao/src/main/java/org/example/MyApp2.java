package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.Student;
import org.example.untils.MybatisUtils;

import java.io.InputStream;
import java.util.List;

/**
 * @PACKAGE_NAME: org.example
 * @NAME: MyApp
 * @date: 2020/7/9 22:18 周四
 * @author: heqinzde
 */
public class MyApp2 {
    public static void main(String[] args) throws Exception {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        String SqlId = "org.example.dao.StudentDao" + "."+"selectStudents";

        List<Student> studentList =  sqlSession.selectList(SqlId);

        studentList.forEach( stu -> System.out.println(stu));

        sqlSession.close();


    }
}
