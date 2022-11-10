package Groups;

public class CountryTeam {
    String Name;
    String ShortName;

    public CountryTeam(String Name, String ShortName){
        this.Name = Name;
        this.ShortName = ShortName;
    }

    public void PrintName(){
        System.out.println(this.Name + " - " + this.ShortName);
    }



}
