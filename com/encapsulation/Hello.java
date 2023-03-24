package com.encapsulation;

import java.time.Period;

public class Hello {
    public static void main(String[] args) {

        Person pooja = new Person("Pooja", 25,"female");
        System.out.println(pooja);
        pooja.setAge(30);
        System.out.println(pooja);
    }
}
