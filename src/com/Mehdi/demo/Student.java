package com.Mehdi.demo;

public class Student {

   private String name;
   private int age;

   // Constructor
   public Student() {} // Empty Constructor
   public Student(String name, int age) {
     setName(name);
     setAge(age);
   }

   public void test() {
      System.out.println("Test");
   }

   // Setters
   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   // Getter
   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }
}

