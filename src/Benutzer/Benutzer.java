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

    public void setSport_liste(List<Sport> sport_liste) {
        this.sport_liste = sport_liste;
    }

    /**
     * man berechnet die totale Zeitspanne, die eine Person braucht, um allen Sporten in seine Liste zu treiben
     * Exception, wenn die Person keinen Sport treibt
     * @return totale_zeit
     */
    public double kalkuliereZeit()
    {
        if(sport_liste.size() <= 0)
            throw new IndexOutOfBoundsException("Es gibt keinen Sport in der Liste");

        double total_zeit = 0;
        for(Sport s : sport_liste)
        {
            total_zeit += s.kalkuliereZeit();
        }

        return total_zeit;
    }

    /**
     * Gibt uns die Zeitspanne fur einen Sport
     * @param sport
     * @return die Zeitspanne fur den gegebenen Sport
     */
    public double kalkuliereZeit(Sport sport)
    {
        return sport.kalkuliereZeit();
    }

    /**
     * Ich berechne das Durchschnittszeit einer Person
     * @return das Durchschnittszeit der Zeitspanne
     */
    public double kalkuliereDurchschnittszeit()
    {
        if(this.sport_liste.size() <= 0)
            throw new IndexOutOfBoundsException("Es gibt keinen Sport in der Liste");

        double total_zeit = 0;
        for(Sport s : this.sport_liste)
        {
            total_zeit += s.kalkuliereZeit();
        }

        return total_zeit/this.sport_liste.size();
    }

}
