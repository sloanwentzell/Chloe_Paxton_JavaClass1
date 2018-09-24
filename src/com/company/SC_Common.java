package com.company;

public class SC_Common {
    int age;
    String name;
    String subject;
    boolean gender;
    int YearsOfTeaching;
    String location;
    boolean FounderOfSchool;

    void describe() {
        System.out.println("My name is " + name );
        System.out.println("I am " + age + " years old");
        if(gender) {
            System.out.println("I'm a female.");
        } else {
            System.out.println("I'm a male.");
        }
        System.out.println("I teach " + subject);
        System.out.println("I taught for " + YearsOfTeaching + " years.");
        System.out.println("I teach at " + location + ".");
        if(FounderOfSchool){
            System.out.println("I'm one of the founders of this school!");
        } else {
            System.out.println("I join the school!");
        }


    }

    void role() {
        System.out.println("My name is " + name + ". I'm a student in " + (age - 6) + "th grade.");
    }
}
