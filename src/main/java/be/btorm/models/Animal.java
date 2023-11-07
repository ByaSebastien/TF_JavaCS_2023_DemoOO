package be.btorm.models;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    public String name = "Gerard";
    public String color;
    public List<String> habits;

    public Animal(){
        this.habits = new ArrayList<>();
    }

    public Animal(String name){
        //Appel du constructeur new Animal()
        this();
        this.name = name;
    }

    public Animal(String name,String color){
        //Appel du constructeur new Animal(String name)
        this(name);
        this.color = color;
    }

    public void roar(){
        System.out.println("AAAAAAAAAAAAAAAAAAA");
    }
}
