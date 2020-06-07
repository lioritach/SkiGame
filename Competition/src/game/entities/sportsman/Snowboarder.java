package game.entities.sportsman;

import game.competition.Competitor;
import game.enums.Discipline;
import game.enums.Gender;
import game.prototype;

public class Snowboarder extends WinterSportsman implements prototype {
    public Snowboarder(String name, double age, Gender gender, double acceleration, double maxSpeed, Discipline discipline) {
        super(name, age, gender, acceleration, maxSpeed, discipline);
    }

    @Override
    public Competitor clone() {
        Snowboarder snowboarder = new Snowboarder(getName(), getAge(), getGender(), getAcceleration(), getMaxSpeed(), getDiscipline());
        return snowboarder;
    }
}
