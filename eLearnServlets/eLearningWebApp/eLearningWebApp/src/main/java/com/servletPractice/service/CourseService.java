package com.servletPractice.service;

import com.servletPractice.model.Course;
import com.servletPractice.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService {
static List<Course> courses = new ArrayList<>();
static {
        courses.add(new Course(1, "Java", 5, 10 ));
        courses.add(new Course(2, "Functional Programming" , 2, 5));
        }
public List<Course> getCourses() {
        return courses;
        }

public List<Course> getCourseByUser(User user) {
        return user.getCourses();
        }
public Optional<Course> getCourseById(int id) {
        return courses.stream().filter(x -> x.getId() == id).findFirst();
        }
        }
