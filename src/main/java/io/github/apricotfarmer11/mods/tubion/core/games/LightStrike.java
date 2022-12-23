package io.github.apricotfarmer11.mods.tubion.core.games;

import io.github.apricotfarmer11.mods.tubion.TubionMod;
import io.github.apricotfarmer11.mods.tubion.core.TeamType;
import io.github.apricotfarmer11.mods.tubion.core.TubnetGame;

public class LightStrike implements TubnetGame {
    public TeamType teamType = TeamType.SQUADS;
    public String name = "Light Strike";
    @Override
    public boolean isInQueue() {
        if (TubionMod.scoreboard.length >= 3) {
            String row = TubionMod.scoreboard[2].toString();
            if (row.toLowerCase().contains("in-queue")) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public TeamType getTeamType() {
        return teamType;
    }
}
