package com.Mehdi.demo;

import com.Mehdi.demo.visibilityTest.AccessModTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccessModTest accessModTest = new AccessModTest();
        Student benny = new Student("Benny", 15);
        Student frida = new Student("Frida", 25);
        Player player1 = new Player();

        List<Student> studentList = new ArrayList<>();
        studentList.add(benny); // Index 0
        studentList.add(frida); // Index 1

        System.out.println( studentList.get(0).getName()); // Access index objects methods
        studentList.get(1).test();

        studentList.add( new Student("Anton", 25)); // Anonymous objects alternative



        // System.out.println(benny.name); // name is private
        System.out.println(benny.getName()); // getName()
        System.out.println(benny.getAge());
        System.out.println(frida.getName());
        System.out.println(frida.getAge());

        benny.setName("Benny"); //  We can now set a private variables value!
       // benny.name = "benny";   // Do Not call a private variable
       benny.setAge(benny.getAge() +1);

        accessModTest.agePublic = 15;
        accessModTest.testPublic();
       // accessModTest.testProtected();  only on same package
       // accessModTest.testNoModifier(); only on same package

        // Question #1
        // TODO - GET / SET within the actual class!

        player1.setScore(500);
        player1.addFivePoints();


        System.out.println(player1.getScore());




    }
}
