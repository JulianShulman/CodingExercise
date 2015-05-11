package leaguetable;

public class TeamLeagueData {

   private final String teamName;

   private final int played;

   private final int won;

   private final int drew;

   private final int lost;

   private final int goalsFor;

   private final int goalsAgainst;

   private final int points;

   private TeamLeagueData(final Builder builder) {
      this.teamName = builder.teamName;
      this.played = builder.played;
      this.won = builder.won;
      this.drew = builder.drew;
      this.lost = builder.lost;
      this.goalsFor = builder.goalsFor;
      this.goalsAgainst = builder.goalsAgainst;
      this.points = builder.points;
   }

   /**
    * @return the drew
    */
   public int getDrew() {
      return this.drew;
   }

   /**
    * @return the goalsAgainst
    */
   public int getGoalsAgainst() {
      return this.goalsAgainst;
   }

   /**
    * @return the goalsFor
    */
   public int getGoalsFor() {
      return this.goalsFor;
   }

   /**
    * @return the lost
    */
   public int getLost() {
      return this.lost;
   }

   /**
    * @return the played
    */
   public int getPlayed() {
      return this.played;
   }

   /**
    * @return the points
    */
   public int getPoints() {
      return this.points;
   }

   /**
    * @return the teamName
    */
   public String getTeamName() {
      return this.teamName.replace("_", " ");
   }

   /**
    * @return the won
    */
   public int getWon() {
      return this.won;
   }

   public static class Builder {
      private final String teamName;
      private int played;
      private int won;
      private int drew;
      private int lost;
      private int goalsFor;
      private int goalsAgainst;
      private int points;

      public Builder(final String teamName) {
         this.teamName = teamName;
      }

      public final TeamLeagueData build() {
         return new TeamLeagueData(this);
      }

      public final Builder drew(final int drew) {
         this.drew = drew;
         return this;
      }

      public final Builder goalsAgainst(final int goalsAgainst) {
         this.goalsAgainst = goalsAgainst;
         return this;
      }

      public final Builder goalsFor(final int goalsFor) {
         this.goalsFor = goalsFor;
         return this;
      }

      public final Builder lost(final int lost) {
         this.lost = lost;
         return this;
      }

      public final Builder played(final int played) {
         this.played = played;
         return this;
      }

      public final Builder points(final int points) {
         this.points = points;
         return this;
      }

      public final Builder won(final int won) {
         this.won = won;
         return this;
      }

   }

}
