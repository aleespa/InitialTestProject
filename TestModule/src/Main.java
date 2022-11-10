import Groups.CountryTeam;
import Groups.Match;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CountryTeam Mexico = new CountryTeam("Mexico", "MX");
        CountryTeam Argentina = new CountryTeam("Argentina", "AR");
        Match firstMatch = new Match(Mexico, Argentina);
        ArrayList<Integer> result = firstMatch.groupStage(1,1);
    }
}