package java_study.day12.football.team;

public class Player {

    private String name;
    private int goal;
    private Position position;

    public Player(String name, int goal, Position position) {
        this.name = name;
        this.goal = goal;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getGoal() {
        return goal;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " " + goal + " " + position;
    }
}
