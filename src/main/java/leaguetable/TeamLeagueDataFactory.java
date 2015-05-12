package leaguetable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public enum TeamLeagueDataFactory {

   Instance;

   private final int teamField = 2;
   private final int goalsForField = 7;
   private final int goalsAgainstField = 9;

   public List<TeamLeagueData> create(final File dataFile) throws IOException {
      final List<TeamLeagueData> teamsData = new ArrayList<TeamLeagueData>();
      final BufferedReader reader = new BufferedReader(new FileReader(dataFile));

      try {
         // The first line contains headings, ignore
         String dataLine = reader.readLine();
         do {
            dataLine = reader.readLine();
            if (dataLine != null) {
               final TeamLeagueData teamData = create(dataLine);
               teamsData.add(teamData);
            }
         } while (dataLine != null);
         return teamsData;
      } finally {
         reader.close();
      }
   }

   public TeamLeagueData create(final String dataLine) {
      final String[] teamData = dataLine.split("\\s+");

      return new TeamLeagueData.Builder(teamData[this.teamField])
            .goalsFor(Integer.parseInt(teamData[this.goalsForField]))
            .goalsAgainst(Integer.parseInt(teamData[this.goalsAgainstField]))
            .build();
   }
}
