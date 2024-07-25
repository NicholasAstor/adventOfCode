package aoc2;

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

    public boolean isCompatible(int maxRed, int maxGreen, int maxBlue){
        for(Round round : rounds){
            if(round.getRed() > maxRed || round.getGreen() > maxGreen || round.getBlue() > maxBlue){
                return false;
            }
        }
        return true;
    }

    public String toString(){
        return "ID: "+this.id;
    }
}
