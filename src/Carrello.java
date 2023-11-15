import java.util.Arrays;

public class Carrello {

    private double prezzoFinale;

    private Articolo[] articoli;

    public Carrello(Articolo[] articoli) { //costruttore dove passiamo Array di articoli
        setArticoli(articoli);
        /*this.articoli = articoli;

        for(int index = 0; index < articoli.length; index++) {
            prezzoFinale += articoli[index].getPrezzo();
        }  nemmeno questo serve più perché public void setArticoli ha già tutta la logica scritta che ci serve*/
    }  //questo è un setter

    public Articolo[] getArticoli() {
        return articoli;
    } //getter

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
        this.prezzoFinale = 0.0;

        for (Articolo articolo : articoli) {
            prezzoFinale += articolo.getPrezzo();
        }
    } //setter

    public double getPrezzoFinale() {
        return prezzoFinale;
    }  //questo è un getter

   /* private void setPrezzoFinale(double prezzoFinale) {
        this.prezzoFinale = prezzoFinale;
    } questo alla fine non serve più perché non lo usiamo al di fuori
     dell'oggetto e il prezzo incrementa man mano */

    @Override
    public String toString() {
        return "Carrello{" +
                "prezzoFinale=" + prezzoFinale +
                ", articoli=" + Arrays.toString(articoli) +
                '}';
    }
}
