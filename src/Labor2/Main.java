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

        List<Sport> list_ana = new ArrayList<Sport>();
        list_ana.add(fussball);
        list_ana.add(hochsprung);
        Benutzer ana = new Benutzer("Ana", "Pop", list_ana);

        List<Sport> list_mihai = new ArrayList<Sport>();
        list_mihai.add(fussball);
        list_mihai.add(basketball);
        list_mihai.add(hochsprung);
        Benutzer mihai = new Benutzer("Mihai", "Radu", list_mihai);

        Benutzer iana = new Benutzer("Iana", "Costel", new ArrayList<Sport>(){});

        System.out.println("Mihais Durchschnitt = " + mihai.kalkuliereDurchschnittszeit());
        System.out.println("Mihais total Zeit = " + mihai.kalkuliereZeit());

        System.out.println("Anas Durchschnitt = " + ana.kalkuliereDurchschnittszeit());
        System.out.println("Anas total Zeit = " + ana.kalkuliereZeit());

        System.out.println("Iana are Durchschnitt = " + iana.kalkuliereDurchschnittszeit());
        System.out.println("Iana are Zeit = " + iana.kalkuliereZeit());


    }
}
