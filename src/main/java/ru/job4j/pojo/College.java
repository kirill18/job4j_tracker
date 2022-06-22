package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setDate("03.09.2009");
        student.setFio("Litiuchii Kirill Nikolaevich");
        student.setGroup("4911");
        System.out.println("ФИО - " + student.getFio() + ",\tДата зачисления - " + student.getDate() + ",\tГруппа - " + student.getGroup());
    }
}
