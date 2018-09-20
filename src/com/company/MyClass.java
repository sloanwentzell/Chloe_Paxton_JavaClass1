package com.company;

class MyClass {

    public static void main(String[] args) {


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
    }

}
