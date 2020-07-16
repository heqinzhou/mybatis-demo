package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.daomain.MyStudent;
import org.example.daomain.Student;
import org.example.vo.QueryParam;
import org.example.vo.ViewStudent;

import java.util.List;
import java.util.Map;

/**
 * @PACKAGE_NAME: org.example.dao
 * @NAME: StudentDao
 * @date: 2020/7/11 10:36 周六
 * @author: heqinz
 */
public interface StudentDao {

    public Student selectStudentById(Integer id);

    List<Student> selectMulitParam(@Param("myname") String name,
                                   @Param("myage") Integer age);

    ViewStudent seleceStudentReturnViewStudent(@Param("sid") Integer id);

    int countStudent();

    Map<Object,Object> selectMapById(Integer id);

        /*
        使用resultMap定义映射关系
         */
    List<Student> selectAllStudent();

    List<MyStudent> selectMyStudent();

    List<MyStudent> selectDiffColProperty();

    /*
    第一种模糊查询，在java代码指定 like的内容
     */

    List<Student> selectLikeOne(String name);

    List<Student> selectLikeTwo(String name);
}
