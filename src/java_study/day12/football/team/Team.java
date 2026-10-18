package java_study.day12.football.team;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> playerList = new ArrayList<>();

    public Team(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void addPlayer(Player player) {
        if (playerList.contains(player)) {
            throw new IllegalArgumentException("Player " + player + " was already added to the list");
        }
        playerList.add(player);
    }

    public int totalGoals() {
        int result = 0;
        for (Player player : playerList) {
            result += player.getGoal();
        }
        return result;
    }

    public double averageGoals(Position p) {
        if (p == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        double result = 0.0;
        int count = 0;
        for (Player player : playerList) {
            if (player.getPosition() == p) {
                result += player.getGoal();
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return result / count;
    }

    public Player topScorer(Position p) {
        if (p == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        Player result = null;
        int topScore = 0;
        for (Player player : playerList) {
            if (player.getPosition() == p && (result == null || topScore < player.getGoal())) {
                result = player;
                topScore = player.getGoal();
            }
        }
        return result;
    }

    public static Team bestAttack(List<Team> teams) {
        if (teams == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Team result = null;
        int topGoalTeam = 0;
        for (Team team : teams) {
            int teamGoal = team.totalGoals();
            if (topGoalTeam < teamGoal) {
                result = team;
                topGoalTeam = teamGoal;
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayerList() {
        return new ArrayList<>(playerList);
    }

    @Override
    public String toString() {
        return name;
    }
}
