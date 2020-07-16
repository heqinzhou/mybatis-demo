package org.example.dao;

import org.example.daomain.Student;

import java.util.List;

/**
 * @PACKAGE_NAME: org.example.dao
 * @NAME: StudentDao
 * @date: 2020/7/11 10:36 周六
 * @author: heqinz
 */
public interface StudentDao {

    public List<Student> selectStudents();

    int insertStudent (Student student);
}
