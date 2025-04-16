import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> ListaRezerwacji;
    private ArrayList<Klient> listaKlientow;

    public void dodajWydarzenie(Wydarzenie w) {
        ListaRezerwacji.add(w);
    }

    public void dodajWydarznie(String nazwa, double cena){
        Wydarzenie w=new Wydarzenie(nazwa, cena);
        ListaRezerwacji.add(w);
    }
    public void dodajKlientow(Klient k) {
        listaKlientow.add(k);
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : ListaRezerwacji) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public Klient znajdzKlientow(String nazwisko) {
        for (Klient k : listaKlientow){
            if(k.getNazwisko().equals(nazwisko)){
                return k;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenie(String nazwa, double nowaCena) {
        Wydarzenie w=znajdzWydarzenie(nazwa);
        if(w==null) {
            throw new IllegalArgumentException("Wydarzenie nie istnieje");

        }
        w.setCena(nowaCena);
    }

    public void dokonajRezerwacji(Klient k, Wydarzenie w) {
         this.ListaRezerwacji.add(w);
         this.listaKlientow.add(k);
         w.zarezerwujMiejsce();
         k.dodajRezerwacje(w);
    }
}
