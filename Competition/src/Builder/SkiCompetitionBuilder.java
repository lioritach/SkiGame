package Builder;

import factory.ArenaFactory;
import game.arena.WinterArena;
import game.competition.Competitor;
import game.entities.sportsman.Skier;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.SnowSurface;
import game.enums.WeatherCondition;

import java.util.ArrayList;

public class SkiCompetitionBuilder implements CompetitionPlan {

    private WinterArena arena;
    private ArrayList<Skier> comps;
    private ArenaFactory factory = ArenaFactory.getInstance();


    @Override
    public void setArena() {
        arena = (WinterArena) factory.BuildArena("winter", 1500, SnowSurface.CRUD, WeatherCondition.SUNNY);
    }

    @Override
    public void addCompetitors(int n) {
        Skier ski = new Skier("avi", 12, Gender.MALE, 12, 200, Discipline.DOWNHILL);
        
    }

    @Override
    public void addCompetitors_toArenas() {

    }
}
