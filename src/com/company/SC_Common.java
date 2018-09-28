package com.company;

public class SC_Common {
    //Fields
    private int age;
    private String name;
    private String subject;
    private boolean gender;
    private int YearsOfTeaching;
    private String location;
    private boolean FounderOfSchool;

    //Constructors
    SC_Common(String theName, int theAge, boolean theGender, String theSubject,
              int YearTeah, String theLocation, boolean theFounder) {
        age = theAge;
        name = theName;
        subject = theSubject;
        gender = theGender;
        YearsOfTeaching = YearTeah;
        location = theLocation;
        FounderOfSchool = theFounder;

    }

    //Methods
    void sayHello(){System.out.println("Hello!");}

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

    void teach(){
        if(subject.equals("math")){
            System.out.println("The square root of 64 is 8!");
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

    void role() {
        System.out.println("My name is " + name + ". I'm a student in " + (age - 6) + "th grade.");
    }

    int getGrade() {
        return age-6;
    }
}



