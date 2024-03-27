package classes.agrregationcomposition;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public String teamName;
    public String cityName;
    public String division;
    public List<Player> playerList = new ArrayList<>();

    public void hireCoach(){
        System.out.println("Coach Hired");
    }
    public void playGame(){
        System.out.println("Play Game");
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void printTeamPlayer(){
        System.out.println("Team name : "+teamName+"\nCity Name : "+cityName+"\nDivision : "+division);
        for (Player p : playerList){
            System.out.println("Player Name : "+p.playerName+"\nPlayerPosition : "+p.playerPosition+
                    "\nPlayer JersyNo : "+p.playerJersyNo);
        }
    }
}
