package com.company;

public class Teacher extends SC_Common{

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

    void sayHello(){System.out.println("Hello!");}


}
