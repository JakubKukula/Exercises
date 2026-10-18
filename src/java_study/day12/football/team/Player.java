package java_study.day12.football.team;

import java.util.Objects;

public class Player {

    private final String name;
    private final int goal;
    private final Position position;

    public Player(String name, int goal, Position position) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        if (goal < 0) {
            throw new IllegalArgumentException("Goal value cannot be less than 0");
        }
        this.goal = goal;
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
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
    public boolean equals(Object o) {
        if (!(o instanceof Player player)) return false;
        return goal == player.goal && Objects.equals(name, player.name) && position == player.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, goal, position);
    }

    @Override
    public String toString() {
        return name + " " + goal + " " + position;
    }
}
