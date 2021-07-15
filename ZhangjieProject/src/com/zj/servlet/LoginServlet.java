package com.zj.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: zhangjie
 * @Date: 2021/6/9 - 06 - 09 - 15:00
 * @Description: com.zj.servlet
 * @version: 1.0
 */


public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("login servlet ");
        //获取请求中的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
       String message=null;
        if (username.equals("zj")&&password.equals("123")){
            message ="success";
        }else{
            message = "fail";
        }
        resp.getWriter().write(message);


    }
}
