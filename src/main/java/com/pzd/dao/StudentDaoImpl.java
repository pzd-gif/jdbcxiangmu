package com.pzd.dao;

import com.pzd.bean.Student;
import com.pzd.utils.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectAll() {
        ResultSet resultSet = JDBC.selectAll();
        List<Student> list = new ArrayList<>();
        try {
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getString("id"));
                student.setName(resultSet.getString("name"));
                student.setSex(resultSet.getString("sex"));
                student.setAge(resultSet.getString("age"));
                student.setAddress(resultSet.getString("address"));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list ;
    }

    @Override
    public int insert(Student student) {
        return JDBC.insert(student);
    }

    @Override
    public int del(String id) {
        return JDBC.delete(id);
    }

    @Override
    public int update(Student student) {
        return JDBC.update(student);
    }

    @Override
    public Student findById(String id) {
        ResultSet resultSet = JDBC.selectAll(id);
        Student student = new Student();
        try {
            while (resultSet.next()) {
                student.setId(resultSet.getString("id"));
                student.setName(resultSet.getString("name"));
                student.setSex(resultSet.getString("sex"));
                student.setAge(resultSet.getString("age"));
                student.setAddress(resultSet.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
