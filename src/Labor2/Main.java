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

        List<Sport> list_daria = new ArrayList<Sport>();
        list_daria.add(fussball);
        list_daria.add(hochsprung);
        list_daria.add(basketball);
        list_daria.add(hindernislauf);
        list_daria.add(fussball);
        list_daria.add(sport);
        Benutzer daria = new Benutzer("Daria", "Radu", list_daria);

        System.out.println("Darias Durchschnitt = " + daria.kalkuliereDurchschnittszeit());
        System.out.println("Darias total Zeit = " + daria.kalkuliereZeit());

    }
}
