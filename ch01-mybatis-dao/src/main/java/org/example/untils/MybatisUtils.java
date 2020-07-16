package org.example.untils;

import jdk.internal.util.xml.impl.Input;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * @PACKAGE_NAME: org.example.untils
 * @NAME: MybatisUtils
 * @date: 2020/7/10 16:08 周五
 * @author: heqinz
 */
public class MybatisUtils {

    private static SqlSessionFactory factory = null;
    static {
        String config = "resources\\mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);

             factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        if(factory != null){
           sqlSession =  factory.openSession();
        }
        return sqlSession;
    }
}
