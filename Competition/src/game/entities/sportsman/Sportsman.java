package game.entities.sportsman;

import game.entities.MobileEntity;
import game.enums.Colors;
import game.enums.Gender;

import java.awt.*;


public class Sportsman extends MobileEntity {
    private final String name;
    private final double age;
    private final Gender gender;
    private Colors color;
    private static int ID = 0;
    private int id;

    public Sportsman(String name, double age, Gender gender, double acceleration, double maxSpeed) {
        super(0, acceleration,maxSpeed);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = Colors.Black;
        ID++;
        this.id = ID;
    }

    public void setColor(Colors color){
        this.color = color;
    }

    public Colors getColor(){
        return color;
    }

    //region Getters & setters
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
    
}
