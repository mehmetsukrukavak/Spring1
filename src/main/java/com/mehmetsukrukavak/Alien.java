package com.mehmetsukrukavak;

public class Alien {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called.");
        this.age = age;
    }

    public Alien() {
        System.out.println("Object Created.");
    }

    public void code(){
        System.out.println("Coding...");
    }
}
