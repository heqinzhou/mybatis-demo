package org.example.dao.Impl;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.daomain.Student;
import org.example.utils.MybatisUtils;

import java.util.List;

/**
 * @PACKAGE_NAME: org.example.dao.Impl
 * @NAME: StudentDaoImpl
 * @date: 2020/7/11 10:51 周六
 * @author: heqinz
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        String SqlId = "org.example.dao.StudentDao" + "."+"selectStudents";

        List<Student> students = sqlSession.selectList(SqlId);

        sqlSession.close();

        return students;

    }

    @Override
    public int insertStudent(Student student) {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        String SqlId = "org.example.dao.StudentDao" + "."+"insertStudents";

        int nums = sqlSession.insert(SqlId,student);

        sqlSession.commit();

        sqlSession.close();
        return nums;
    }
}
