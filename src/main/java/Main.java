public class Main {
    public static void main(String[] args) {


        MojaData mojeUrodziny = new MojaData(9, 04, 2020);

        mojeUrodziny.wyswietlDate();
        mojeUrodziny.wyswietlDate2();
        mojeUrodziny.wyswietlDate3();

        Wydarzenie ileZostaloDoMoichUrodzin= new Wydarzenie(mojeUrodziny, "Moje urodziny");
        ileZostaloDoMoichUrodzin.ileZostaloMiesiecy();
        ileZostaloDoMoichUrodzin.ileZostaloLat();

    }
}
