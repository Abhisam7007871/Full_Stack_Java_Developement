package com.composition;

import com.composition.laptop.Laptop;
import com.composition.laptop.components.GraphicsCard;
import com.composition.laptop.components.Processor;

public class Hello {
    public static void main(String[] args) {
//        Laptop lapppy = new Laptop();
//        System.out.println(lapppy.getProcessor().getBrand());

        Processor processor = new Processor("intel", "7300U",7,4,3,"6MB","2.1Ghz","2.1Ghz","3.1Ghz");

        GraphicsCard graphicsCard = new GraphicsCard("Nviddia", 1050, "4GB");

        Laptop gamingLaptop = new Laptop(17f,processor,"DDR4","2TB",graphicsCard,null,"backlit");

        System.out.println(gamingLaptop);

        gamingLaptop.gamingMode();

        System.out.println("Gaming Mode is ON");
        System.out.println("Current Frequency: "+gamingLaptop.getProcessor().getFrequency());
    }
}

