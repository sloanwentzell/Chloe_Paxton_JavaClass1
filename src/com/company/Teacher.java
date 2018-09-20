package com.company;

public class Teacher {
    int age;
    String name;
    String subject;
    boolean gender;
    int YearsOfTeaching;
    String location;
    boolean FounderOfSchool;

    void describe() {
     System.out.println("My name is " + name );
     System.out.println("I am " + age + "years old");
        if(gender) {
            System.out.println("I'm a female.");
        } else {
            System.out.println("I'm a male.");
        }
     System.out.println("I teach " + subject);
     System.out.println("I taught for " + YearsOfTeaching);
     System.out.println("I teach at " + location);
        if(FounderOfSchool){
            System.out.println("I'm one of the founders of this school!");
        } else {
            System.out.println("I join the school!");
        }


    }

    void teach(){
        if(subject.equals("math")){
            System.out.println(" The square root of 64 is 8!");
        } if (subject.equals("english")){
            System.out.println("I before E, except after C!");
        } if (subject.equals("science")) {
           System.out.println("A mole equals 6.022140857 × 10^23!");
        } if (subject.equals("history")){
           System.out.println("The Declaration Of Independence was signed in Philadelphia in 1776!");
        } if (subject.equals("an elective")) {
            System.out.println("You're going to learn a lot!");
        }
    }

    void sayHello(){System.out.println("Hello!");}


}
