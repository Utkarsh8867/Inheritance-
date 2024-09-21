// package Hybrid Inheritance; 

import javax.swing.event.SwingPropertyChangeSupport;

public class Hybrid_heritance {
    public static void main(String[] args) {
        
    }
}
// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Mammals{
    void Swim(){
        System.out.println("Swim");
    }
}

class tuna extends Fish{

    void name(){
        System.out.println("I ma a tuna Fish");
    }


}

class Bird extends Fish{
    void Fly(){
        System.out.println("fly");
    }
}




