package leaguetable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTeamLeagueData {

   @Test
   public final void attributes() {
      final String name = "Arsenal";
      final int played = 38;
      final int won = 26;
      final int drew = 9;
      final int lost = 3;
      final int goalsFor = 79;
      final int goalsAgainst = 36;
      final int points = 87;

      final TeamLeagueData arsenal = new TeamLeagueData.Builder(name)
            .played(played)
            .won(won)
            .drew(drew)
            .lost(lost)
            .goalsFor(goalsFor)
            .goalsAgainst(goalsAgainst)
            .points(points)
            .build();

      assertEquals(name, arsenal.getTeamName());
      assertEquals(played, arsenal.getPlayed());
      assertEquals(won, arsenal.getWon());
      assertEquals(drew, arsenal.getDrew());
      assertEquals(lost, arsenal.getLost());
      assertEquals(goalsFor, arsenal.getGoalsFor());
      assertEquals(goalsAgainst, arsenal.getGoalsAgainst());
      assertEquals(points, arsenal.getPoints());

   }
}
