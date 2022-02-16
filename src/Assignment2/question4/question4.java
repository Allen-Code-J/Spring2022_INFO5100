package Assignment2.question4;

import java.util.Arrays;
import java.util.Comparator;

public class question4 {
    public static void main(String[] args) {
        //Make some new Player
        Player player1 = new Player("Till", 80);
        Player player2 = new Player("Peter", 80);
        Player player3 = new Player("King", 90);
        Player player4 = new Player("Will", 70);

        Player[] players = {player1, player2, player3, player4};
        Comparator<Player> comparatorScore = (playerA, playerB) -> Integer.compare(playerA.getScore(), playerB.getScore());
        Comparator<Player> comparatorName = (playerA, playerB) -> playerA.getName().compareTo(playerB.getName());


        Player.printPlayers(players);
        Arrays.sort(players, comparatorName);
        Arrays.sort(players, comparatorScore(false));
        System.out.println("*****After sort****");
        Player.printPlayers(players);
    }

    public static Comparator<Player> comparatorScore ( boolean lowestFirst){
        if (lowestFirst) {
            return (playerA, playerB) -> Integer.compare(playerA.getScore(), playerB.getScore());
        }
        return (playerA, playerB) -> Integer.compare(playerB.getScore(), playerA.getScore());
    }

}

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public static void printPlayers(Player[] players) {
        System.out.println("[name" + '\t' + "score]");
        for (Player player : players) {
            System.out.println(" " + player.getName() + '\t' + player.getScore());
        }
    }

}