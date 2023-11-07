package be.btorm;

import be.btorm.models.Animal;
import be.btorm.utils.Dice;

public class DemoMethode {
    public static void main(String[] args) {

        Animal a = new Animal("Alphonse","Rouge");
        a.manger(10);

        System.out.println(a.toString());

        System.out.println(Dice.roll(6));
        System.out.println(Dice.roll(20));
        System.out.println(Dice.roll(100));
    }
}
