package com.zj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: zhangjie
 * @Date: 2021/5/25 - 05 - 25 - 21:02
 * @Description: com.zj.servlet
 * @version: 1.0
 */

@WebServlet("/servlet.do")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int h = Integer.parseInt(req.getParameter("h"));
        int l = Integer.parseInt(req.getParameter("l"));
        StringBuilder sbd=new StringBuilder();

    }
}
