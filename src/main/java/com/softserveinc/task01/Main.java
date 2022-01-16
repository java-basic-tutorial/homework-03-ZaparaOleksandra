package com.softserveinc.task01;

/**
    1. Create a public class Human in this package
    2. Class should have the private fields:
        - firstName (String type)
        - lastName (String type)
        - dateOfBirth (String type)
        - phone (String type)
    3. Create public accessor methods (getter and setter) for each field.
    4. Create the one public constructors with no parameters and one with four parameters.
    5. Override the method toString() to return string that represent a human.
    6. Check your solution by running the unit tests
 */
public class Main {

    /*static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
        static void print(int[] arr) {
        System.out.println("arr.length = " + arr.length);
        
        }
   /* static double avg(double a, double b) {
        return ((a+b)/2);
    }
        static double avg(double a, double b, double c) {
        return ((a+b+c)/2);
        } */
    /* static double avg(double... arr) {
         double avg = 0.0;
         for (int i = 0; i < arr.length; i++)  {
             avg += arr[i];
         }
         return avg / arr.length;
     } */


    public static void main(String[] args) {
        // TODO: Uncomment code bellow after the class Human have been created
        Human vajsa = new Human("Vasilij", "Pjpkin", "01/01/1987", "+38 (012) 123-45-67");
        System.out.println("vajsa = " + vajsa);
        vajsa.setPhone("+38 (032) 321-45-98");
        System.out.println("vajsa = " + vajsa);

        Human masha = new Human("Masha", "Rasputina", "01/12/1986", "+38 (021) 123-45-67");
        System.out.println("masha = " + masha);


}
}