package com.pzd.servlet;

import com.pzd.dao.StudentDao;
import com.pzd.dao.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelServlet")
public class DelServlet extends HttpServlet {
    StudentDao dao = new StudentDaoImpl();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求、响应编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        String id = request.getParameter("sid");
        int insert = dao.del(id);
        response.sendRedirect("/jdbc_Test/StudentServlet");
    }

}
