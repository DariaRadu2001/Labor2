package Benutzer;

import Leichtathletik.Hindernislauf;
import Leichtathletik.Hochsprung;
import Mannschaftssport.Basketball;
import Mannschaftssport.Fussball;
import Sport.Sport;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    private Benutzer ana;
    private Benutzer mihai;
    private Benutzer iana;

    void input()
    {
        Sport fussball = new Fussball();
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        List<Sport> list_ana = new ArrayList<Sport>();
        list_ana.add(fussball);
        list_ana.add(hochsprung);
        list_ana.add(fussball);
        ana = new Benutzer("Ana","Pop",list_ana);

        List<Sport> list_mihai = new ArrayList<Sport>();
        list_mihai.add(fussball);
        list_mihai.add(basketball);
        list_mihai.add(hochsprung);
        mihai = new Benutzer("Mihai","Man",list_mihai);

        iana = new Benutzer("Iana", "Costel", new ArrayList<Sport>(){});

    }


    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {

        input();

        try
        {
            iana.kalkuliereZeit();
        }
        catch (Exception e)
        {
            assert(true);
        }


        try
        {
            assertEquals(140,mihai.kalkuliereZeit());
        }
        catch (Exception e)
        {
            assert(false);
        }

        try
        {
            assertEquals(150,ana.kalkuliereZeit());
        }
        catch (Exception e)
        {
            assert(false);
        }


    }

    @org.junit.jupiter.api.Test
    void testKalkuliereZeit() {
        Benutzer mihail = new Benutzer("Mihail", "Ioan", new ArrayList<Sport>(){});
        Sport fussball = new Fussball();
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        try
        {
            assertEquals(55, mihail.kalkuliereZeit(basketball));
        }
        catch (Exception e)
        {
            assert(false);
        }

        try
        {
            assertEquals(65, mihail.kalkuliereZeit(fussball));
        }
        catch (Exception e)
        {
            assert(false);
        }

        try
        {
            assertEquals(30, mihail.kalkuliereZeit(hindernislauf));
        }
        catch (Exception e)
        {
            assert(false);
        }

        try
        {
            assertEquals(20, mihail.kalkuliereZeit(hochsprung));
        }
        catch (Exception e)
        {
            assert(false);
        }
    }

    @org.junit.jupiter.api.Test
    void kalkuliereDurchschnittszeit() {

        input();

        try
        {
            iana.kalkuliereZeit();
        }
        catch (Exception e)
        {
            assert(true);
        }


        try
        {
            assertEquals(46.666666666666664,mihai.kalkuliereDurchschnittszeit());
        }
        catch (Exception e)
        {
            assert(false);
        }

        try
        {
            assertEquals(50.0,ana.kalkuliereDurchschnittszeit());
        }
        catch (Exception e)
        {
            assert(false);
        }


    }
}