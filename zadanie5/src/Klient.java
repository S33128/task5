import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> ListaRezerwacji=new ArrayList<>();

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public boolean dodajRezerwacje(Wydarzenie w) {
        ListaRezerwacji.add(w);
        return true;
    }
    public void wyswietlRezerwacje() {
        for(Wydarzenie w : ListaRezerwacji) {
            System.out.println(w);
        }
    }
    public void usunRezerwacje(Wydarzenie w) {
        ListaRezerwacji.remove(w);
    }

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
