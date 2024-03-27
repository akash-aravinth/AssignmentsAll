package classes.agrregationcomposition;

public class Player {
    public String playerName;
    public String playerPosition;
    public int playerJersyNo;
    public Team playerTeam;

    public void printPlayer(){
        System.out.println("Player Name : "+playerName+"\nPlayerPosition : "+playerPosition+
                "\nPlayer JersyNo : "+playerJersyNo+"\nPlayerTeam : \n"+"Team name : "+playerTeam.teamName+" CityName : "+playerTeam.cityName+" Division : "+playerTeam.division);
    }

}
