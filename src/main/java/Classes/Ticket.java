package Classes;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Ticket {
    private DecimalFormat price;
    private Calendar date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int routeNumber;

    public Ticket(DecimalFormat price, Calendar date, int startZone, int finishZone, boolean isLuggage, int place, int routeNumber) {
        this.price = price;
        this.date = date;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.isLuggage = isLuggage;
        this.place = place;
        this.routeNumber = routeNumber;
    }
    
}
