package com.shuai.servletpackage;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        System.out.println("进入了DoGet方法");

        // ServletContext 是凌驾于所有servlet之上的，用于不同servlet之间的数据共享
        ServletContext context = this.getServletContext();
        String username = "Shuai";
        context.setAttribute("username", username);

        PrintWriter writer = resp.getWriter();
        writer.print("Hello, servlet.");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
