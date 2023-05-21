package com.driver;

public class Main {
   //task 1
   public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    //task2
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        // Task 5
        obj.meth();
    }
  
}