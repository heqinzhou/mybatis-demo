package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.Student;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @PACKAGE_NAME: org.example
 * @NAME: TestMybatis
 * @date: 2020/7/10 14:09 周五
 * @author: heqinz
 */
public class TestMybatis {

    @Test
    public void testinsert() throws IOException {
        String config = "resources\\mybatis.xml";

        InputStream in =  Resources.getResourceAsStream(config);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        SqlSession sqlSession = factory.openSession();

        String SqlId = "org.example.dao.StudentDao" + "."+"insertStudent";

        Student student = new Student();
        student.setId(1004);
        student.setName("LIXIAOTAO");
        student.setEmail("TAOZIZI@126.com");
        student.setAge(31);
        int nums =  sqlSession.insert(SqlId,student);
        sqlSession.commit();
        System.out.println("执行结果：" + nums);
        sqlSession.close();
    }
}
