package leaguetable;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class TestTeamLeagueDataFactory {

   @Test
   public final void dataFile() throws IOException {

      final File dataFile = new File("src/main/resources/football.dat");
      final List<TeamLeagueData> teams = TeamLeagueDataFactory.Instance.create(dataFile);

      assertEquals(20, teams.size());
   }

   @Test
   public final void dataLine() {
      final String dataLine = "    1. Arsenal         38    26   9   3    79  -  36    87";

      final TeamLeagueData arsenal = TeamLeagueDataFactory.Instance.create(dataLine);

      assertEquals("Arsenal", arsenal.getTeamName());
      assertEquals(79, arsenal.getGoalsFor());
      assertEquals(36, arsenal.getGoalsAgainst());
   }
}