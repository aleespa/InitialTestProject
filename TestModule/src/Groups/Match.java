package Groups;

import java.util.ArrayList;
import java.util.List;

public class Match {

    CountryTeam Team1;
    CountryTeam Team2;

    public Match(CountryTeam Team1, CountryTeam Team2){
        this.Team1 = Team1;
        this.Team2 = Team2;
    }

    public ArrayList<Integer> groupStage(Integer goals1, Integer goals2){
        if (goals1.equals(goals2)){
            ArrayList<Integer> points=new ArrayList<Integer>();
            points.add(1);
            points.add(1);
            System.out.println("Draw between "+ this.Team1.ShortName + " and "+  this.Team2.ShortName);
            return points;
        } else if (goals1 > goals2) {
            ArrayList<Integer> points=new ArrayList<Integer>();
            points.add(3);
            points.add(0);
            System.out.println(this.Team1.ShortName + " wins against "+  this.Team2.ShortName);
            return points;
        }else {
            ArrayList<Integer> points=new ArrayList<Integer>();
            points.add(0);
            points.add(3);
            System.out.println(this.Team2.ShortName + " wins against "+  this.Team1.ShortName);
            return points;
        }
    }
}
