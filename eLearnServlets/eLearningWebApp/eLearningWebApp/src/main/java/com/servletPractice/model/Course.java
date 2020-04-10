package com.servletPractice.model;

public class Course {
    int id;
    String name;
    int duration;
    float cost;

    public Course(int id, String name, int duration, float cost) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
