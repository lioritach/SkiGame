package game.entities.sportsman;

import game.competition.Competitor;
import game.enums.Discipline;
import game.enums.Gender;
import game.prototype;


public class Skier extends WinterSportsman implements prototype {
    public Skier(String name, double age, Gender gender, double acceleration, double maxSpeed, Discipline discipline) {
        super(name, age, gender, acceleration, maxSpeed, discipline);
    }



    @Override
    public Competitor clone() {
        Skier skier = new Skier(getName(), getAge(), getGender(), getAcceleration(), getMaxSpeed(), getDiscipline());
        return skier;
    }
}
