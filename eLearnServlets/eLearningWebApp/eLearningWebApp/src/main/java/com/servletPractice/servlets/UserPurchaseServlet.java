package com.servletPractice.servlets;

import com.servletPractice.model.Course;
import com.servletPractice.model.User;
import com.servletPractice.service.UserService;
import com.servletPractice.service.CourseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/user-purchase")
public class UserPurchaseServlet  extends HttpServlet {
    CourseService userService = new CourseService();
    UserService loginService = new UserService();
    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        Optional<Course> course = userService.getCourseById((Integer.parseInt(httpServletRequest.getParameter("courseId"))));
        User user = (User)httpServletRequest.getSession().getAttribute("username");
        if(course.isPresent()) {
            if(user.getCourses().stream().anyMatch(x -> x.getId() != course.get().getId()) && course.get().getCost() <= user.getBalance()) {
                user.setBalance(user.getBalance() - course.get().getCost());
                user.getCourses().add(course.get());
                httpServletRequest.setAttribute("message", "You have purchased the course!");
            } else {
                System.out.println("No Funds");
                httpServletRequest.setAttribute("message", "Insufficient Funds!");
            }
        }
        httpServletRequest.getRequestDispatcher("/user-view").forward(httpServletRequest, httpServletResponse);

    }
}
