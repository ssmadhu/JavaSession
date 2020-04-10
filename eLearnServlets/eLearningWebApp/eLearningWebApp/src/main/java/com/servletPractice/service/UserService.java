package com.servletPractice.service;

import com.servletPractice.model.Course;
import com.servletPractice.model.User;
import com.servletPractice.model.UserType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {
    static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Madhumitha Sekar", "smadhu", "smadhu", 50, UserType.Admin));
        users.add(new User(1, "Akshay Sharma", "asharma", "asharma", 50, UserType.User));
        users.get(1).setCourses(Arrays.asList(new Course(1, "Java", 5, 10 )));
    }

    public boolean isValidUser(String username, String password) {
        return users.stream()
                .anyMatch(x -> x.getUsername().equalsIgnoreCase(username) &&
                        x.getPassword().equals(password));
    }

    public Optional<User> getMatchingUser(String username, String password) {
        return users.stream()
                .filter(x -> x.getUsername().equalsIgnoreCase(username) &&
                        x.getPassword().equals(password))
                .findFirst();
    }

    public Optional<User> getMatchingUser(String username) {
        return users.stream()
                .filter(x -> x.getUsername().equalsIgnoreCase(username))
                .findFirst();
    }
}
