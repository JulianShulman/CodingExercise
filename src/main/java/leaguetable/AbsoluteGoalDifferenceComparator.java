package leaguetable;

import java.util.Comparator;

public class AbsoluteGoalDifferenceComparator implements Comparator<TeamLeagueData> {

   public AbsoluteGoalDifferenceComparator() {

   }

   public int compare(final TeamLeagueData team1, final TeamLeagueData team2) {
      return TeamLeagueDataLogic.Instance.absoluteGoalDifference(team1)
            - TeamLeagueDataLogic.Instance.absoluteGoalDifference(team2);
   }

}
