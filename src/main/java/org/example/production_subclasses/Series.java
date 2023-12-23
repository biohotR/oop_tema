package org.example.production_subclasses;

import org.example.Episode;
import org.example.production_subclasses.Production;

import java.util.List;
import java.util.Map;

public class Series extends Production {
    private int launchYear;
    private int seasonCount;
    private Map<String, List<Episode>> seasonEpisodes;

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public int getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(int seasonCount) {
        this.seasonCount = seasonCount;
    }

    public Map<String, List<Episode>> getSeasonEpisodes() {
        return seasonEpisodes;
    }

    public void setSeasonEpisodes(Map<String, List<Episode>> seasonEpisodes) {
        this.seasonEpisodes = seasonEpisodes;
    }

    public void displayInfo()
    {
        System.out.println("Show name: " + this.getProductionName());
    }
}
