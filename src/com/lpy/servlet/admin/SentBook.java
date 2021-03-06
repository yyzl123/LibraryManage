package com.lpy.servlet.admin;

import com.lpy.bean.history;
import com.lpy.dao.AdminDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SentBook")
public class SentBook extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        AdminDao ad = new AdminDao();
        List<history> list = ad.SentAllBook();
        request.setAttribute("list",list);
        request.getRequestDispatcher("Admin_Rent_Book.jsp").forward(request,response);

    }
}
