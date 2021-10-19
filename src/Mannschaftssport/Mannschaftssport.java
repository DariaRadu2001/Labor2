package Mannschaftssport;

import Sport.Sport;

public abstract class Mannschaftssport implements Sport {

    /**
     *man berechnet die Zeit, die man fur einen Mannschaftsport braucht
     */
    @Override
    public abstract double kalkuliereZeit();
}
