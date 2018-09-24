package com.company;

class Student extends SC_Common{


    void role() {
        System.out.println("My name is " + name + ". I'm a student in " + (age - 6) + "th grade.");
    }

    int getGrade() {
        return age-6;
    }

}
