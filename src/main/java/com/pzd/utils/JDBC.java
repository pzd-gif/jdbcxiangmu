package com.pzd.utils;

import com.pzd.bean.Student;
import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
    //获取mysql数据库的链接
    public static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/shixunyi";
        String username = "root";
        String password = "123123";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //添加的方法
    public static int insert(Student student) {
        Connection conn = getConn();
        //用于返回结果
        int  i = 0;
        String sql = "insert into student (Id,Name,Sex,Age,Address) values(?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1,student.getId());
            pre.setString(2,student.getName());
            pre.setString(3,student.getSex());
            pre.setString(4,student.getAge());
            pre.setString(5,student.getAddress());
            i = pre.executeUpdate();
            pre.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    //查询所有的方法
    public static ResultSet selectAll(){
        Connection conn = getConn();
        String sql = "select * from student";
        ResultSet resultSet = null;
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            resultSet = pre.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    //查询所有的方法
    public static ResultSet selectAll(String id){
        Connection conn = getConn();
        String sql = "select * from student where id = "+id;
        ResultSet resultSet = null;
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            resultSet = pre.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    //删除的方法
    public static int delete(String Id) {
        Connection conn = getConn();
        //用于返回结果
        int  i = 0;
        String sql = "delete from student where id ="+Id;
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
             i =pre.executeUpdate();
            pre.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    //修改的方法
    public static int update(Student student) {
        Connection conn = getConn();
        //用于返回结果
        int  i = 0;
        String sql = "update student set name='"+student.getName()+"',address='"+student.getAddress()+"',sex='"+student.getSex()+"',age = '"+student.getAge()+"'where id="+student.getId();
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            i = pre.executeUpdate();
            pre.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
