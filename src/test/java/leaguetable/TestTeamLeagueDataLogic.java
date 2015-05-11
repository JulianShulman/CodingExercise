package leaguetable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTeamLeagueDataLogic {

   @Test
   public final void absoluteGoalDifference() {
      final TeamLeagueData a = new TeamLeagueData.Builder("a")
            .goalsFor(10)
            .goalsAgainst(20)
            .build();

      final TeamLeagueData b = new TeamLeagueData.Builder("b")
            .goalsFor(20)
            .goalsAgainst(5)
            .build();

      final TeamLeagueData c = new TeamLeagueData.Builder("c")
            .goalsFor(10)
            .goalsAgainst(5)
            .build();

      assertEquals(10, TeamLeagueDataLogic.Instance.absoluteGoalDifference(a));
      assertEquals(15, TeamLeagueDataLogic.Instance.absoluteGoalDifference(b));
      assertEquals(5, TeamLeagueDataLogic.Instance.absoluteGoalDifference(c));
   }

   @Test
   public final void standardGoalDifference() {
      final TeamLeagueData a = new TeamLeagueData.Builder("a")
            .goalsFor(10)
            .goalsAgainst(20)
            .build();

      final TeamLeagueData b = new TeamLeagueData.Builder("b")
            .goalsFor(20)
            .goalsAgainst(5)
            .build();

      final TeamLeagueData c = new TeamLeagueData.Builder("c")
            .goalsFor(10)
            .goalsAgainst(5)
            .build();

      assertEquals(-10, TeamLeagueDataLogic.Instance.standardGoalDifference(a));
      assertEquals(15, TeamLeagueDataLogic.Instance.standardGoalDifference(b));
      assertEquals(5, TeamLeagueDataLogic.Instance.standardGoalDifference(c));
   }

}