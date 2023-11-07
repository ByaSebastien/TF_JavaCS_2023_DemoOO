package be.btorm;

import be.btorm.models.Animal;

public class DemoConstructor {
    public static void main(String[] args) {

        //Constructeur vide
        Animal a = new Animal();
//        a.name = "Gilbert";
        a.color = "Jaune";
        System.out.println(a.name);
        System.out.println(a.color);
        a.roar();

        //Constructeur custom
        System.out.println("_______________________________________");
        Animal a2 = new Animal("Rocky","Orange");
        System.out.println(a2.name);
        System.out.println(a2.color);
        a2.roar();


        System.out.println("_______________________________________");
        Animal a3 = new Animal("Boubou");
        System.out.println(a3.name);
        System.out.println(a3.color);
        a3.roar();

//        Attention a ne pas essayer d'acceder a des methodes ou des proprieté sur un objet null
//        Animal aNull;
//        aNull.name;


    }
}