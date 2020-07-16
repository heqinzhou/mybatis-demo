package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.daomain.Student;
import org.example.vo.QueryParam;

import java.util.List;

/**
 * @PACKAGE_NAME: org.example.dao
 * @NAME: StudentDao
 * @date: 2020/7/11 10:36 周六
 * @author: heqinz
 */
public interface StudentDao {

    public Student selectStudentById(Integer id);

    List<Student> selectMulitParam(@Param("myname") String name, @Param("myage") Integer age);


    List<Student> selectMulitObject(QueryParam param);

    List<Student> selectMulitStudent(Student student);
}
