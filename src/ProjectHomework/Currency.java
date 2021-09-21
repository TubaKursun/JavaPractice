package ProjectHomework;

public class Currency {


    public static void main(String[] args) {


      /*  Task-1
        A is Novelist, reads book written by esseyist
        B is Poet, reads book writteb by archaelogist
        C is Playwright, reads book written by poet
        D is Musician, reads book written by playwright
        E is Archaelogist, reads book written misician
        F is Essayist, reads book written by novelist

       */
     //=============================================================
         //TASK2

        //JDK is a software development kit whereas JRE is a software bundle that allows Java program to run, whereas JVM is an environment for executing bytecode.
       // The full form of JDK is Java Development Kit, while the full form of JRE is Java Runtime Environment, while the full form of JVM is Java Virtual Machine.
        // JDK is platform dependent, JRE is also platform dependent, but JVM is platform independent.
        //JDK contains tools for developing, debugging, etc. JRE contains class libraries and other supporting files, whereas software development tools are not included in JVM.
       // JDK comes with the installer, on the other hand, JRE only contains the environment to execute source code whereas JVM bundled in both software JDK and JRE.

//================================================================================

        // task4
        long tl = 85000;
        double dollar1 = 8.5;
        double haveDollar =tl/dollar1;

        System.out.println(haveDollar);

//=================================================================

        // task5
        double metre = 2000;
        double inch = metre*0.0254;

        System.out.println(inch);

        //================================================================

        // task6
        int minutes = 3456789;
        int minuteInYear =525600;
        int minuteInDay = 1440;
        int numberOfYears = minutes/minuteInYear;
        System.out.println(numberOfYears);

        int numberOfDays = minutes%minuteInYear/minuteInDay;
        System.out.println(numberOfDays);
        //System.out.println(minutes+numberOfYears+numberOfDays);

        //==========================
        //TASK 7

String Name = "Tuba Kursun";
String Adress = "28 Rob Road";
String Adress2 = "Mount Prospect, IL 60056";

// Every thing in double coute " is a string  you cannot call the variable names.


        System.out.println("+------------------------------------------------------------------+");
        System.out.println("|                                                            ####  |");
        System.out.println("|                                                            ####  |");
        System.out.println("|                                                            ####  |");
        System.out.println("|                                                                  |");
        System.out.println("|                                   "+Name+ "                    |");
        System.out.println("|                                   "+Adress+"                    |");
        System.out.println("|                                   "+Adress2+"       |");
        System.out.println("|                                                                  |");
        System.out.println("|                                                                  |");
        System.out.println("+------------------------------------------------------------------+");





    }

}
