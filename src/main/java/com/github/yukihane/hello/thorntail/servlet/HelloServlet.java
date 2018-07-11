package com.github.yukihane.hello.thorntail.servlet;

import com.github.yukihane.hello.thorntail.cdi.MyBean;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/*")
public class HelloServlet extends HttpServlet {

    @Inject
    private MyBean myBean;

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doGet");

        resp.getWriter()
                .append("<html><body>")
                .append(myBean.getDate().toString())
                .append("</body></html>")
                .close();
    }
}
