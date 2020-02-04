import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Wydarzenie {
    MojaData dataWydarzenia;
    String nazwaWydarzenia;

    public Wydarzenie(MojaData dataWydarzenia, String nazwaWydarzenia) {
        this.dataWydarzenia = dataWydarzenia;
        this.nazwaWydarzenia = nazwaWydarzenia;
    }

    public int ileZostaloLat() {
        Date date = new Date();
        LocalDate today = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Pobranie obecnej daty.
        int ileLat = dataWydarzenia.getYears() - today.getYear();
        System.out.println("Do wydarzenia zostało " + ileLat + " lat.");
        return ileLat;
    }

    public int ileZostaloMiesiecy() {
        Date date = new Date();
        LocalDate today = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearsDiff = ileZostaloLat();
        int monthsDiff = Math.abs((dataWydarzenia.getMonths().ordinal() + 1) - today.getMonth().getValue());
        if (today.getDayOfMonth() > dataWydarzenia.getDays()) { // Jezeli obecny dzien miesiaca jest wiekszy niz dzien miesiaca
            // w ktorym odbywa sie wydarzenie, to nie liczymy wtedy tego miesiaca (gdyz jest niepelny)
            monthsDiff--;
        }
        int ileMiesięcy = yearsDiff * 12 + Math.abs(monthsDiff);
        System.out.println("Do wydarzenia zostało " + ileMiesięcy + " miesięcy");
        return ileMiesięcy;
    }

}
