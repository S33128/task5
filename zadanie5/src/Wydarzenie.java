public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Wydarzenie(String nazwa, double cena,String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }
    public boolean zarezerwujMiejsce() {
        if(dostepneMiejsca<=0){
            System.out.println("brak miejsc");
            return false;
        }
        this.dostepneMiejsca--;
        return true;
    }
    public String toString(){
        return this.nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        if (dostepneMiejsca < 0) {
            throw new IllegalArgumentException("liczba miejsc mosi byc wieksza od 0");
        }
        if (dostepneMiejsca > maxLiczbaMiejsc) {
            throw new IllegalArgumentException("dostepna liczba miejsc nie morze byc wieksza niz ich liczba");
        }
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if(cena<0){
            throw new IllegalArgumentException("Cena musi byc wieksza od zera");
        }
        this.cena = cena;
    }


}
