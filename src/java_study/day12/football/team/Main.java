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

        /*                                                                  poprawka
        lions.averageGoals(Position.FORWARD)      = 7                       7.0
        eagles.averageGoals(Position.FORWARD)     = 6.5     ← dokładnie     6.5
        eagles.averageGoals(Position.MIDFIELDER)  = 0.0                     0.0
        eagles.topScorer(Position.FORWARD)        = Orzeł                   Orzeł
        eagles.topScorer(Position.GOALKEEPER)     = null                    Wrona
        eagles.topScorer(Position.MIDFIELDER)     = null                    null
        Team.bestAttack(teams)                    = Lions                   Lions
         */

        System.out.println(lions.averageGoals(Position.FORWARD));
        System.out.println(eagles.averageGoals(Position.FORWARD));
        System.out.println(eagles.averageGoals(Position.MIDFIELDER));
        System.out.println(eagles.topScorer(Position.FORWARD));
        System.out.println(eagles.topScorer(Position.GOALKEEPER));
        System.out.println(eagles.topScorer(Position.MIDFIELDER));
        /*
    === ŚLAD eagles.topScorer(GOALKEEPER) ===
    start: result = null, topScore = 0
    1. Wrona: pozycja ? == GOALKEEPER? true   result == null? true    → result = Wrona   topScore = 0
    2. Sowa:  pozycja ? == GOALKEEPER? false   → przechodzi do następnej iteracji   result = Wrona   topScore = 0
    3. Orzeł: pozycja ? == GOALKEEPER? false   → przechodzi do następnej iteracji   result = Wrona   topScore = 0
    4. Sokół: pozycja ? == GOALKEEPER? flase   → przechodzi do następnej iteracji   result = Wrona   topScore = 0
    wynik: result = Wrona   topScore = 0

    === ŚLAD Team.bestAttack(teams) ===
    start: result = null, topGoalTeam = 0
    1. Lions:  totalGoals = 14   result == null? true          → result = Lions   top = 14
    2. Eagles: totalGoals = 14   result == null? false   14 < 14 → false   → result = Lions   top = 14
    wynik: Lions   (dlaczego nie ta druga drużyna: bo nie ma więcej goli a tyle samo a polecenie mowił że jak jest
    remis to zostaje pierwsza)
    */
        System.out.println(Team.bestAttack(teams));

    }
}
