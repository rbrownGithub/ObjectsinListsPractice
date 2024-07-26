package org.example;
import java.util.ArrayList;
import java.util.Scanner;

class TvShow {
    private String name;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String name, int numberOfEpisodes, String genre) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getNumberOfEpisodes() + " number of episodes. The genre is " + getGenre();
    }
}

