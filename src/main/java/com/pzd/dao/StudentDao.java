package com.pzd.dao;

import com.pzd.bean.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAll();

    int insert(Student student);

    int del(String id);

    int update(Student student);

    Student findById(String id);
}
