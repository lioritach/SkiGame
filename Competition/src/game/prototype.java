package game;

import game.competition.Competitor;

public interface prototype extends Cloneable {

    public Competitor clone();

}
