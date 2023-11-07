package be.btorm.models;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    public static int nbAnimals = 0;

    private String name = "Gerard";
    private String color;
    private List<String> habits;

    public Animal(){
        this.habits = new ArrayList<>();
        nbAnimals += 1;
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

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name.trim().isEmpty()){
            return;
        }
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public List<String> getHabits(){
        return List.copyOf(this.habits);
    }

    public void addHabit(String habit){
        this.habits.add(habit);
    }

    public void remove(String habit){
        this.habits.remove(habit);
    }

    public void roar(){
        System.out.println("AAAAAAAAAAAAAAAAAAA");
        //Dans une methode d'instance j'ai acces a mes champ static
//        System.out.println(nbAnimals);
    }

    public void manger(){
        manger(1);
    }

    public void manger(int nbFood){
        System.out.println(this.name + " eat " + nbFood + " food(s)");
    }

    public static void truc(){
        //Dans une methode static je n'ai pas acces aux instances (this)
        System.out.println("Fais un truc!");
    }

    @Override
    public String toString(){
//        return super.toString();
        return "Name : " + this.name + "\nColor : " + this.color;
    }
}
