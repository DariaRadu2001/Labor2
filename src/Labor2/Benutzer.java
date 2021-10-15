package Labor2;

import Sport.Sport;

import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    public double kalkuliereZeit()
    {
        return 0;
    }

    public double kalkuliereZeit(Sport sport)
    {
        return 0;
    }

    public double kalkuliereDurchschnittszeit()
    {
        return 0;
    }

}
