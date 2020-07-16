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

    List<Student> selectStudentIf(Student student);

    //foreach 1

    List<Student>  selectStudentForOne(List<Integer> idlist);

    List<Student>  selectStudentForTwo(List<Student> idlist);


    List<Student>  seleceAll();




}
