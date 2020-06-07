package factory;

import game.arena.IArena;
import game.arena.SummerArena;
import game.arena.WinterArena;
import game.enums.SnowSurface;
import game.enums.WeatherCondition;

public class ArenaFactory {

    private static ArenaFactory instance;

    public static ArenaFactory getInstance(){

        if(instance == null){
            instance = new ArenaFactory();
        }
        return instance;
    }

    public IArena BuildArena(String arenaType, double length, SnowSurface surface, WeatherCondition condition){

        if(arenaType == null)
            return null;

        switch(arenaType){

            case "summer":
                return new SummerArena(length, surface, condition);

            case "winter":
                return new WinterArena(length, surface, condition);

        }
        return null;
    }

    //todo gui arena factory,

}
