package aoc2pt2;

import java.util.ArrayList;

public class Game {
    private int id;
    private ArrayList<Round> rounds;

    public Game(int id){
        this.id = id;
        rounds = new ArrayList<Round>();
    }

    public int getId(){
        return this.id;
    }

    public ArrayList<Round> getRounds(){
        return this.rounds;
    }

    public void addRounds(Round round){
        this.rounds.add(round);
    }


    public String toString(){
        return "ID: "+this.id;
    }
}
