// package single Inheritnce.Multi Level Inheritance;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MLInheritance {
    public static void main(String[] args) {
        dog tuffy = new dog();
        tuffy.eat();
        tuffy.legs = 4;
        System.out.println(tuffy.legs);

    }
}
//  Multi level Inheritance
    class Animal{
        String color;
    
        void eat(){
            System.out.println("eats");
            System.out.println("Hello I am from class Animal");
        }
    
        void breathe(){
            System.out.println("breathes");
        }
    }

    class Mammals extends Animal{
        int legs;

    }

    class dog extends Mammals{
        String breed; 
    }
// }
