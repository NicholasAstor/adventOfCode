package aoc2pt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/aoc2pt2/input.txt");
        Scanner in = new Scanner(file);

        ArrayList<Game> games = new ArrayList<Game>();

        while(in.hasNextLine()){
            String line = in.nextLine();
            String[] lineParts = line.split(": ");

            int gameId = Integer.parseInt(lineParts[0].split(" ")[1]);
            Game game = new Game(gameId);

            String rounds = lineParts[1];
            String[] cubes = rounds.split("; ");

            for(String s: cubes){
                int red = 0, blue = 0, green = 0;
                String[] cube = s.split(", ");

                for(String v: cube){
                    int cont = Integer.parseInt(v.split(" ")[0]);
                    String color = v.split(" ")[1];
                    switch(color){
                        case "red" :
                            red = cont;
                            break;
                        case "green" :
                            green = cont;
                            break;
                        case "blue" :
                            blue = cont;
                            break;
                    }
                }
                game.addRounds(new Round(red, green, blue));
            }
            games.add(game);
        }

        in.close();

        int cont = 0;

        for(Game game : games){

        }

        System.out.println("A soma dos ids dos jogos é: "+cont);
    }
}
