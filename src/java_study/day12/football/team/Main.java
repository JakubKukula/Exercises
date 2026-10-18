package java_study.day12.football.team;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Team lions = new Team("Lions");
        lions.addPlayer(new Player("Kowal",     0, Position.GOALKEEPER));
        lions.addPlayer(new Player("Nowak",     2, Position.DEFENDER));
        lions.addPlayer(new Player("Zieliński", 5, Position.MIDFIELDER));
        lions.addPlayer(new Player("Lis",       7, Position.FORWARD));

        Team eagles = new Team("Eagles");
        eagles.addPlayer(new Player("Wrona", 0, Position.GOALKEEPER));
        eagles.addPlayer(new Player("Sowa",  1, Position.DEFENDER));
        eagles.addPlayer(new Player("Orzeł", 9, Position.FORWARD));
        eagles.addPlayer(new Player("Sokół", 4, Position.FORWARD));

        List<Team> teams = new ArrayList<>(List.of(lions, eagles));

        /*
        lions.averageGoals(Position.FORWARD)      = 7
        eagles.averageGoals(Position.FORWARD)     = 6.5     ← dokładnie
        eagles.averageGoals(Position.MIDFIELDER)  = 0.0
        eagles.topScorer(Position.FORWARD)        = Orzeł
        eagles.topScorer(Position.GOALKEEPER)     = null
        eagles.topScorer(Position.MIDFIELDER)     = null
        Team.bestAttack(teams)                    = Lions
         */

        System.out.println(lions.averageGoals(Position.FORWARD));
        System.out.println(eagles.averageGoals(Position.FORWARD));
        System.out.println(eagles.averageGoals(Position.MIDFIELDER));
        System.out.println(eagles.topScorer(Position.FORWARD));
        System.out.println(eagles.topScorer(Position.GOALKEEPER));
        System.out.println(eagles.topScorer(Position.MIDFIELDER));
        System.out.println(Team.bestAttack(teams));

    }
}
