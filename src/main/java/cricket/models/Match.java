package cricket.models;

public class Match {
    private Team team1;
    private Team team2;
    private Schedule schedule;
    private String ground;
    private Scorecard scorecard1;
    private Scorecard scorecard2;

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public Scorecard getScorecard1() {
        return scorecard1;
    }

    public void setScorecard1(Scorecard scorecard1) {
        this.scorecard1 = scorecard1;
    }

    public Scorecard getScorecard2() {
        return scorecard2;
    }

    public void setScorecard2(Scorecard scorecard2) {
        this.scorecard2 = scorecard2;
    }
}
