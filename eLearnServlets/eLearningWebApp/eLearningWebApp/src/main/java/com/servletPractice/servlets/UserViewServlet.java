package com.servletPractice.servlets;

import com.servletPractice.model.User;
import com.servletPractice.service.CourseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user-view")
public class UserViewServlet extends HttpServlet {
    CourseService userService = new CourseService();
    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.setAttribute("courses", userService.getCourses());
        User user = (User)httpServletRequest.getSession().getAttribute("username");
        System.out.println(httpServletRequest.getAttribute("message"));
        httpServletRequest.setAttribute("userCourses", user.getCourses());
        httpServletRequest.getRequestDispatcher("WEB-INF/user.jsp")
                .forward(httpServletRequest, httpServletResponse);
    }
}
