package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.Student;

import java.io.InputStream;
import java.util.List;

/**
 * @PACKAGE_NAME: org.example
 * @NAME: MyApp
 * @date: 2020/7/9 22:18 周四
 * @author: heqinzde
 */
public class MyApp {
    public static void main(String[] args) throws Exception {
        //定义mybatis主配置文件的名称，从类路径的根开始

        String config = "resources\\mybatis.xml";

        InputStream in =  Resources.getResourceAsStream(config);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        SqlSession sqlSession = factory.openSession();

        String SqlId = "org.example.dao.StudentDao" + "."+"selectStudents";

        List<Student> studentList =  sqlSession.selectList(SqlId);

        studentList.forEach( stu -> System.out.println(stu));

        sqlSession.close();


    }
}
