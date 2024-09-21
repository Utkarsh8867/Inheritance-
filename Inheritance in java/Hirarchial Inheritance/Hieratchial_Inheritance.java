// package Hirarchial Inheritance;

public class Hieratchial_Inheritance {
    
    public static void main(String[] args) {
        Bird sparrow =new Bird();
        sparrow.walk();
        sparrow.Swim();
        sparrow.breathe();
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

class Bird extends Fish{
    void Fly(){
        System.out.println("fly");
    }
}


