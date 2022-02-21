package cricket.models;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tournament {

    private int totalTeam;
    private Set<Team> teams = new HashSet<>();
    private List<Match> matchList = new LinkedList<>();

    public Tournament(int totalTeam){
        this.totalTeam = totalTeam;
    }

    public int getTotalMatches(){
        if(this.totalTeam % 2 == 0){
            return (totalTeam/2)*(totalTeam+1);
        } else if(this.totalTeam % 2 == 1){
            return ((totalTeam+1)/2)*totalTeam;
        }
        return 0;
    }

}
