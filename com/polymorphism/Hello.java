package com.polymorphism;

import com.polymorphism.phone.Nokia;

import com.polymorphism.phone.Phone;
import com.polymorphism.phone.Samsung;

public class Hello {
    public static void main(String[] args) {
//        Phone phone = new Phone("Nokia 3310");
//        System.out.println(phone.getModel());
//        phone.features();
//
//        SamsungNote8 note8 = new Samsung("Note 8");
//        System.out.println(note8.getModel());
//        note8.feature();


        Phone nokia3310 = new Hello().phone(1);
        System.out.println(nokia3310.getModel());
        nokia3310.features();

        Phone note8 = new Hello().phone(2);
        System.out.println(note8.getModel());
        note8.features();

    }
    public  Phone phone(int dailyDriver){
        switch (dailyDriver){
            case 1: return new Nokia("3310");
            case 2: return new Samsung("Note 5");
        }
        return null;
    }

}
