package be.btorm;

import be.btorm.models.Animal;
import be.btorm.models.FinalDemo;

public class DemoModifAcces {

    public static void main(String[] args) {

        Animal a = new Animal("Roger","Brun");
        //champ private inaccessible dans le main
//        animal.habits.add("Coucou");

        // pour acceder a des champ static on doit passer par la classe (Animal) et non l'instance (a)
        System.out.println(Animal.nbAnimals);
        Animal.truc();
        a.truc();

        FinalDemo final1 = new FinalDemo("Toto");
        System.out.println(final1.name);
        FinalDemo final2 = new FinalDemo("Roger");
        System.out.println(final2.name);
        //Final sur un attribut est readonly;
//        final1.name = "tt";
        System.out.println(final1.NAME);
        System.out.println(final2.NAME);
    }
}
