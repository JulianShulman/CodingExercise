package leaguetable;

/**
 * enum singleton for TeamLeagueData logic.
 */
public enum TeamLeagueDataLogic {

   Instance;

   public final int absoluteGoalDifference(final TeamLeagueData tld) {
      // Goal difference here is defined as the difference between for
      // and against goals, rather than the (goals for - goals against) which it
      // normally is.
      // Therefore the value will always be positive
      return Math.abs(tld.getGoalsFor() - tld.getGoalsAgainst());
   }

   public final int standardGoalDifference(final TeamLeagueData tld) {
      return tld.getGoalsFor() - tld.getGoalsAgainst();
   }

}
