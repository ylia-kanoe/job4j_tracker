package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Mukhina Yulia Igorevna");
        student.setGroup("MPRz18");
        student.setEntrance(2020, 8, 30);

        System.out.println(student.getFullName() + " is in the group - " + student.getGroup()
                + " : " + " from " + student.getEntrance());
    }
}
