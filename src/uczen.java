public class uczen extends Osoba {
    private static int LiczbaUczniow=0;
    private int nrUcznia;

    public uczen(String nazwisko, String imie) {
        super(nazwisko, imie);
        LiczbaUczniow++;
        nrUcznia=LiczbaUczniow;
    }

    public static int getLiczbaUczniow() {
        return LiczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        LiczbaUczniow = liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }


    @Override
    public String toString() {
        return "uczen{ imie:" + getImie()+"nazwisko"+getNazwisko()+
                "nrUcznia=" + nrUcznia +
                '}';
    }
}
