package leaguetable;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestGoalDifferenceComparator {

   @Test
   public final void sort() {
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

      final List<TeamLeagueData> teams = new ArrayList<TeamLeagueData>();
      teams.add(a);
      teams.add(b);
      teams.add(c);

      Collections.sort(teams, new AbsoluteGoalDifferenceComparator());

      assertEquals("c", teams.get(0).getTeamName());
      assertEquals("a", teams.get(1).getTeamName());
      assertEquals("b", teams.get(2).getTeamName());
   }
}