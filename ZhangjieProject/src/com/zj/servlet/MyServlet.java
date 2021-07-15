package com.zj.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @Auther: zhangjie
 * @Date: 2021/6/9 - 06 - 09 - 14:19
 * @Description: com.zj.servlet
 * @version: 1.0
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      /*   int num =new Random().nextInt();
         String message =num%2==0?"happy birthday":"happy new year";
        PrintWriter writer =resp.getWriter();
        writer.write(message);
        System.out.println("login servlet ");*/
        //获取请求中的数据
        System.out.println(req.getRequestURL());
        System.out.println(req.getParameter("password"));

        System.out.println(req.getContextPath());

       System.out.println(req.getHeaderNames());
        /* System.out.println(req.getHttpServletMapping());*/
        System.out.println(req.getMethod());
        //System.out.println(req.getParts());
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String decede=null;
        if (username.equals("zj")&&password.equals("123")){
            decede ="success";

        }else{
            decede = "fail";
        }
        resp.getWriter().write(decede);


    }

    }

