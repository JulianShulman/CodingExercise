package leaguetable;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class TestLeagueTableReader {

   @Test
   public final void dataFile() throws IOException {

      final LeagueTableReader ltr = new LeagueTableReader();

      final File dataFile = new File("src/main/resources/football.dat");
      final List<TeamLeagueData> teams = ltr.readDataFile(dataFile);

      assertEquals(20, teams.size());
   }

   @Test
   public final void dataLine() {
      final String dataline = "    1. Arsenal         38    26   9   3    79  -  36    87";

      final LeagueTableReader ltr = new LeagueTableReader();

      final TeamLeagueData arsenal = ltr.readDataLine(dataline);

      assertEquals("Arsenal", arsenal.getTeamName());
      assertEquals(79, arsenal.getGoalsFor());
      assertEquals(36, arsenal.getGoalsAgainst());
   }
}
