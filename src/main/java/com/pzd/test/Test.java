package com.pzd.test;

import com.pzd.bean.Student;
import com.pzd.dao.StudentDao;
import com.pzd.dao.StudentDaoImpl;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentDao dao = new StudentDaoImpl();
        List<Student> students = dao.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
        Student student = new Student("车月", "男", "15","山东省");
        dao.insert(student);
        System.out.println("成功添加单条数据");
        Student student1 = new Student("说的","女", "15", "陕西省西安市");
        int update = dao.update(student1);
        if(update>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        int del = dao.del("4");
        if(del>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
}
