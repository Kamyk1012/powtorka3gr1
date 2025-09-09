public  abstract  class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String nazwisko, String imie) {
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public Osoba() {
        imie="Jan";
        nazwisko="kowalski";
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
