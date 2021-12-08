package ru.geekbrains;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emFactory = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory();

        StudentRepository repo = new StudentRepository(emFactory);
        int i =0;
        while (i<=10){
            repo.insert(new Student(null, "Student" + i, (int) Math.random()));
            i++;
        }

        repo.findAll().forEach(System.out::println);
    }
}
