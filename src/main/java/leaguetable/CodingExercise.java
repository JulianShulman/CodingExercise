package leaguetable;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class CodingExercise {

   public CodingExercise() {

   }

   public static void main(final String[] args) {

      try {
         // Read in the league data.
         final File dataFile = new File("src/main/resources/football.dat");
         final List<TeamLeagueData> teams = TeamLeagueDataFactory.Instance.create(dataFile);

         // Sort with goal difference comparator
         Collections.sort(teams, new AbsoluteGoalDifferenceComparator());

         // Print out "league table"
         for (final TeamLeagueData team : teams) {
            System.out
                  .println(String.format("%-20s has an absolute goal difference of %2d, having scored %2d and conceded %2d",
                  team.getTeamName(), TeamLeagueDataLogic.Instance.absoluteGoalDifference(team), team.getGoalsFor(),
                        team.getGoalsAgainst()));
         }

         System.out.println("Therefore the team with the smallest absolute goal difference is " + teams.get(0).getTeamName());

      } catch (final IOException e) {
         e.printStackTrace(System.err);
      }

   }
}