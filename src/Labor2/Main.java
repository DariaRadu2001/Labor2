package Labor2;
import Benutzer.Benutzer;
import Leichtathletik.Hindernislauf;
import Leichtathletik.Hochsprung;
import Mannschaftssport.Basketball;
import Mannschaftssport.Fussball;
import Sport.Sport;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        Sport sport = new Hochsprung();

        List<Sport> listDaria = new ArrayList<Sport>();
        listDaria.add(fussball);
        listDaria.add(hochsprung);
        listDaria.add(basketball);
        listDaria.add(hindernislauf);
        listDaria.add(fussball);
        listDaria.add(sport);
        Benutzer daria = new Benutzer("Daria", "Radu", listDaria);

        System.out.println("Darias Durchschnitt = " + daria.kalkuliereDurchschnittszeit());
        System.out.println("Darias total Zeit = " + daria.kalkuliereZeit());

    }
}
