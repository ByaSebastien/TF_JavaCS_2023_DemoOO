package be.btorm;

import be.btorm.models.Animal;

public class DemoGetSet {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.setName("Gilbert");
        a.setColor("Jaune");
        System.out.println(a.getName());
        System.out.println(a.getColor());
        a.roar();

        //Constructeur custom
        System.out.println("_______________________________________");
        Animal a2 = new Animal("Rocky","Orange");
        System.out.println(a2.getName());
        System.out.println(a2.getColor());
        a2.roar();


        System.out.println("_______________________________________");
        Animal a3 = new Animal("Boubou");
        System.out.println(a3.getName());
        System.out.println(a3.getColor());
        a3.roar();
    }
}
