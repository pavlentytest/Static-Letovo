package com.company;

public class Main {

    public static void main(String[] args) {

        Car opel = new Car();
        opel.setName("Opel");

        Car.wheels++;

        Car bmw = new Car();
        System.out.println(bmw.wheels);

        Car toyota = new Car();
        System.out.println(toyota.wheels);

       // Car car = new Car();
       // int w = car.wheels;

       // Car.POWER = 100;

        //Car.doSmth();
        toyota.doSmth();

        // строка неизменяемая - immutable
        String str = "Hello";
        str = "abc";

        // строка изменяемая - mutable
        //StringBuffer StringBuilder


        String s1 = "Test";
        System.out.println(System.identityHashCode(s1));
        s1 = "acbdef";
        System.out.println(System.identityHashCode(s1));

        StringBuilder sb1 = new StringBuilder("Moscow");
        System.out.println(System.identityHashCode(sb1));

        sb1.append("123");
        System.out.println(System.identityHashCode(sb1));


        String a1 = "Hello";
        String a2 = "Hello";
        System.out.println(a1==a2); // true
        System.out.println(a1.equals(a2)); // true

        String b1 = new String("School");
        String b2 = new String("School");
        System.out.println(b1==b2); // false
        System.out.println(b1.equals(b2)); // true


    }
}
