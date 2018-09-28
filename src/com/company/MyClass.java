package com.company;

class MyClass {

    public static void main(String[] args) {

        SC_Common[] people = new SC_Common[7];

        people[0] = new Teacher("Mr.Latimer", 38, false, "math",
                10, "Science Leadership Academy", false);

        people[1] = new Teacher("Mr.Hernandez", 41, false, "an elective",
                15, "Science Leadership Academy", false);

        people[2] = new Teacher("Ms.Jonas", 35, true, "history",
                10, "Science Leadership Academy", false);

        people[3] = new Teacher("Ms.Pahomov", 31, true, "english",
                9, "Science Leadership Academy", false);

        people[4] = new Teacher("Ms.Sessa", 28, true, "science",
                8, "Science Leadership Academy", false);

        people[5] = new Student("Steve Smith", 15);

        people[6] = new Student("Beth Burnham", 18);

        people[7] = new Student("Clive Clugston", 17);

        // Say Hi.
        for (int i = 0; i < 7; i++) {
            people[i].sayHello();
        }

        // Describe.
        System.out.println("Describe Yourself");
        for (int i = 0; i < 5; i++) {
            people[i].describe();
        }

        //Student Describe
        System.out.println("Who are you?");
        for (int i = 5; i < 7; i++) {
            people[i].role();
        }
        //Get Grade
            System.out.println("What's the grade?");
            for (int i = 5; i < 7; i++) {
                people[i].getGrade();
            }

            //Teach!
            System.out.println("Start teaching!");
            for (int i = 0; i < 5; i++) {
                people[i].teach();
            }

        }
    }


