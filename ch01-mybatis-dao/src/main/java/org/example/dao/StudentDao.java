package org.example.dao;

import org.example.domain.Student;

import java.util.List;

/**
 * @PACKAGE_NAME: org.example.dao
 * @NAME: StudentDao
 * @date: 2020/7/9 19:28 周四
 * @author: heqinz
 */
public interface StudentDao {
    public List<Student> selectStudents();

    //插入方法
    //参数student,表示要插入到数据库的数据
    public int insertStudent(Student student);
}
