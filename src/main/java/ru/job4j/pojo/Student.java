package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private String group;
    private LocalDate entrance;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getEntrance() {
        return entrance;
    }

    public void setEntrance(int year, int month, int dayOfMonth) {
        this.entrance = LocalDate.of(year, month, dayOfMonth);
    }
}
