package classes.agrregationcomposition;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.playerName = "Dhoni";
        player.playerPosition = "WicketKeeper";
        player.playerJersyNo = 7;
        Team team = new Team();
        team.teamName = "Chennai Super Kings";
        team.cityName = "Chennai";
        team.division = "India";
        player.playerTeam = team;
        team.addPlayer(player);

        player.printPlayer();

        System.out.println("----------------Team Information----------------");
        team.printTeamPlayer();
    }
}
