package com.servletPractice.servlets;

import com.servletPractice.model.User;
import com.servletPractice.model.UserType;
import com.servletPractice.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    UserService userService = new UserService();
    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("WEB-INF/login.jsp")
                .forward(httpServletRequest, httpServletResponse);
    }

    @Override
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        if(userService.isValidUser(username,password)) {
            User user = userService.getMatchingUser(username, password).get();
            httpServletRequest.getSession().setAttribute("username", user);
            if(user.getType() == UserType.User) {
                httpServletResponse.sendRedirect("/user-view");
            } else {
                httpServletRequest.getRequestDispatcher("WEB-INF/admin.jsp")
                        .forward(httpServletRequest, httpServletResponse);
            }
        } else {
            httpServletRequest.setAttribute("error", "Invalid credentials");
            doGet(httpServletRequest, httpServletResponse);
        }
    }

}
