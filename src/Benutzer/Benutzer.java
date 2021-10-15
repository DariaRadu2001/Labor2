package Benutzer;

import Sport.Sport;

import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport_liste;

    public Benutzer(String vorName, String nachName, List<Sport> sport_liste) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport_liste = sport_liste;
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

    public List<Sport> getSport_liste() {
        return sport_liste;
    }

    public void setSport_liste(List<Sport> sportsport_liste) {
        this.sport_liste = sport_liste;
    }

    public double kalkuliereZeit()
    {
        if(sport_liste.size() <= 0)
            throw new IndexOutOfBoundsException("Es gibt kein Sport in der Liste");

        double total_zeit = 0;
        for(Sport s : sport_liste)
        {
            total_zeit += s.kalkuliereZeit();
        }

        return total_zeit;
    }

    public double kalkuliereZeit(Sport sport)
    {
        return sport.kalkuliereZeit();
    }

    public double kalkuliereDurchschnittszeit()
    {
        if(this.sport_liste.size() <= 0)
            throw new IndexOutOfBoundsException("Es gibt kein Sport in der Liste");

        double total_zeit = 0;
        for(Sport s : this.sport_liste)
        {
            total_zeit += s.kalkuliereZeit();
        }

        return total_zeit/this.sport_liste.size();
    }

}
