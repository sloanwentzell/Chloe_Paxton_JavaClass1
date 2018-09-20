package com.company;

class MyClass {

    public static void main(String[] args) {

        Teacher mrlatimer = new Teacher();
        mrlatimer.name = "Mr.Latimer";
        mrlatimer.age = 38;
        mrlatimer.gender = false;
        mrlatimer.subject = "math";
        mrlatimer.YearsOfTeaching = 10;
        mrlatimer.location = "Science Leadership Academy";
        mrlatimer.FounderOfSchool = false;

        Teacher mrhernandez = new Teacher();
        mrhernandez.name = "Mr.Hernandez";
        mrhernandez.age = 41;
        mrhernandez.gender = false;
        mrhernandez.subject = "an elective";
        mrhernandez.YearsOfTeaching = 15;
        mrhernandez.location = "Science Leadership Academy";
        mrhernandez.FounderOfSchool = false;

        Teacher msjonas = new Teacher();
        msjonas.name = "Ms.Jonas";
        msjonas.age = 35;
        msjonas.gender = true;
        msjonas.subject = "history";
        msjonas.YearsOfTeaching = 10;
        msjonas.location = "Science Leadership Academy";
        msjonas.FounderOfSchool = false;

        Teacher mspahomov = new Teacher();
        mspahomov.name = "Ms.Pahomov";
        mspahomov.age = 31;
        mspahomov.gender = true;
        mspahomov.subject = "english";
        mspahomov.YearsOfTeaching = 9;
        mspahomov.location = "Science Leadership Academy";
        mspahomov.FounderOfSchool = false;

        Teacher mssessa = new Teacher();
        mssessa.name = "Ms.Jonas";
        mssessa.age = 28;
        mssessa.gender = true;
        mssessa.subject = "science";
        mssessa.YearsOfTeaching = 8;
        mssessa.location = "Science Leadership Academy";
        mssessa.FounderOfSchool = false;



        Student steve = new Student();
        steve.age = 15;
        steve.name = "Steve Smith";

        Student beth = new Student();
        beth.age = 18;
        beth.name = "Beth Burnham";

        Student clive = new Student();
        clive.age = 17;
        clive.name = "Clive Clugston";

        System.out.println("Who are you?");
        System.out.println();
        steve.role();
        System.out.println();
        beth.role();
        System.out.println();
        clive.role();
        System.out.println();


        int avgGrade = (steve.getGrade() + beth.getGrade() + clive.getGrade())/3;
        System.out.println("The average grade of students surveyed is grade " + avgGrade + ".");

        // Say Hi.
        System.out.println("Say hello guys!!");
        mrlatimer.sayHello();
        mrhernandez.sayHello();
        msjonas.sayHello();
        mspahomov.sayHello();
        mssessa.sayHello();
        System.out.println();

        // Describe.
        System.out.println("Describe Yourself");
        mrlatimer.describe();
        System.out.println();
        mrhernandez.describe();
        System.out.println();
        msjonas.describe();
        System.out.println();
        mspahomov.describe();
        System.out.println();
        mssessa.describe();
        System.out.println();

        //Teach!
        System.out.println("Start teaching!");
        mrlatimer.teach();
        System.out.println();
        mrhernandez.teach();
        System.out.println();
        msjonas.teach();
        System.out.println();
        mspahomov.teach();
        System.out.println();
        mssessa.teach();
        System.out.println();
    }

}
