package Benutzer;

import Sport.Sport;

import java.util.List;

public class Benutzer {

    private String vorname;
    private String nachname;
    private List<Sport> sportListe;

    public Benutzer(String vorName, String nachName, List<Sport> sportListe) {
        this.vorname = vorName;
        this.nachname = nachName;
        this.sportListe = sportListe;
    }

    public String getVorName() {
        return vorname;
    }

    public void setVorName(String vorName) {
        this.vorname = vorName;
    }

    public String getNachName() {
        return nachname;
    }

    public void setNachName(String nachName) {
        this.nachname = nachName;
    }

    public List<Sport> getSport_liste() {
        return sportListe;
    }

    public void setsportListe(List<Sport> sportListe) {
        this.sportListe = sportListe;
    }

    /**
     * man berechnet die totale Zeitspanne, die eine Person braucht, um allen Sports in seine Liste zu treiben
     * Exception, wenn die Person keinen Sport treibt
     * @return totaleZeit
     */
    public double kalkuliereZeit()
    {
        if(sportListe.size() <= 0)
            throw new IndexOutOfBoundsException("Es gibt keinen Sport in der Liste");

        double totalZeit = 0;
        for(Sport s : sportListe)
        {
            totalZeit += s.kalkuliereZeit();
        }

        return totalZeit;
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
     * Ich berechne die Durchschnittszeit einer Person
     * @return die Durchschnittszeit der Zeitspanne
     */
    public double kalkuliereDurchschnittszeit()
    {
        if(this.sportListe.size() <= 0)
            throw new IndexOutOfBoundsException("Es gibt keinen Sport in der Liste");

        double totalZeit = 0;
        for(Sport s : this.sportListe)
        {
            totalZeit += s.kalkuliereZeit();
        }

        return totalZeit/this.sportListe.size();
    }

}
